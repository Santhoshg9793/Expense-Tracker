/**
 * 
 */
package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CommonConstants;
import com.CommonResponse;
import com.user.constants.UserConstants;
import com.user.request.UserAddRequest;
import com.user.request.UserAuthRequest;
import com.user.response.UserSaveResponse;
import com.user.service.IUserService;

/**
 * @author Santhosh
 *
 */

@RestController
@RequestMapping(value = UserConstants.USER_URL)
public class UserController {

	@Autowired
	private IUserService userService;

	/**
	 * Method to save or update user details
	 * 
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public UserSaveResponse saveorUpdateUserDetails(@RequestBody UserAddRequest req) throws Exception {
		UserSaveResponse res = new UserSaveResponse();
		res = userService.saveorUpdateUserDetails(req);
		res.setStatus(CommonConstants.SUCESS);
		res.setMessage(CommonConstants.USER_SAVE_SUCESS);
		return res;
	}

	/**
	 * Method to authenticate user login
	 * 
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = UserConstants.USER_AUTH_URL, method = RequestMethod.POST)
	@ResponseBody
	public CommonResponse userAuth(@RequestBody UserAuthRequest req) throws Exception {
		CommonResponse res = new CommonResponse();
		boolean check = userService.userAuth(req);
		if (check) {
			res.setMessage(CommonConstants.USER_LOGIN_SUCCESS);
		} else {
			res.setMessage(CommonConstants.USER_LOGIN_FAILURE);
		}
		res.setStatus(CommonConstants.SUCESS);

		return res;
	}
}
