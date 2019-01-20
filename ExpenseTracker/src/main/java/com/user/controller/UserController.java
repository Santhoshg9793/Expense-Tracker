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
import com.user.constants.UserConstants;
import com.user.request.UserAddRequest;
import com.user.response.UserSaveResponse;
import com.user.service.IUserService;

/**
 * @author Santhosh
 *
 */

@RestController
@RequestMapping(value=UserConstants.USER_URL)
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public UserSaveResponse saveorUpdateUserDetails(@RequestBody UserAddRequest req) throws Exception{
		UserSaveResponse res=new UserSaveResponse();
		res=userService.saveorUpdateUserDetails(req);
		res.setStatus(CommonConstants.SUCESS);
		res.setMessage(CommonConstants.USER_SAVE_SUCESS);
		return res;
	}
}
