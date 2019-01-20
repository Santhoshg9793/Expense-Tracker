/**
 * 
 */
package com.user.dao;

import org.hibernate.SessionFactory;

import com.user.bean.UserBean;

/**
 * @author Santhosh
 *
 */
public interface IUserDao {

	/**
	 * Method to save or update user details
	 * @param req
	 * @return
	 * @throws Exception 
	 */
	UserBean saveorUpdateUserDetails(UserBean userBean,SessionFactory sessionFactory) ;
}
