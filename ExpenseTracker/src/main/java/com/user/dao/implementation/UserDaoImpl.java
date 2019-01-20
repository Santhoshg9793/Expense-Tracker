/**
 * 
 */
package com.user.dao.implementation;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.Util;
import com.user.bean.UserBean;
import com.user.dao.IUserDao;

/**
 * @author Santhosh
 *
 */
@Repository
public class UserDaoImpl implements IUserDao {

	/**
	 * Method to save or update user details
	 */
	@Override
	public UserBean saveorUpdateUserDetails(UserBean userBean, SessionFactory sessionFactory) {
		if (!Util.isNull(userBean)) {
			sessionFactory.getCurrentSession().saveOrUpdate(userBean);
			sessionFactory.getCurrentSession().flush();
			sessionFactory.getCurrentSession().clear();
		}
		return userBean;
	}

}
