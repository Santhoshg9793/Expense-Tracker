/**
 * 
 */
package com.user.service.implementation;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.Util;
import com.user.bean.UserBean;
import com.user.dao.IUserDao;
import com.user.request.UserAddRequest;
import com.user.response.UserSaveResponse;
import com.user.service.IUserService;

/**
 * @author Santhosh
 *
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	@Autowired
	private SessionFactory sessionFactory;
	

	/**
	 * Method to save or update user details
	 * 
	 * @throws Exception
	 */
	@Override
	@Transactional(rollbackOn=Exception.class)
	public UserSaveResponse saveorUpdateUserDetails(UserAddRequest req) throws Exception {
		if (Util.isNull(req) || Util.isNull(req.getUserBean())) {
			throw new Exception("First name cannot be null for an user");
		}
		UserSaveResponse res=new UserSaveResponse();
		UserBean user = req.getUserBean();

		if (!Util.isNull(user)) {
			user.setCreatedTs(Util.getCurrentTimeStamp());
			user.setUpdatedTs(Util.getCurrentTimeStamp());
			user.setIsDeleted(false);
		}
		res.setUserBean(userDao.saveorUpdateUserDetails(user, sessionFactory));
		return res;
	}

}
