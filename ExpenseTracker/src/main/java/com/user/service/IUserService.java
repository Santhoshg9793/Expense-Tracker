/**
 * 
 */
package com.user.service;

import com.user.request.UserAddRequest;
import com.user.response.UserSaveResponse;

/**
 * @author Santhosh
 *
 */
public interface IUserService {

	/**
	 * Method to save or update user details
	 * @param req
	 * @return
	 * @throws Exception 
	 */
	UserSaveResponse saveorUpdateUserDetails(UserAddRequest req) throws Exception;
}
