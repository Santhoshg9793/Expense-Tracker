/**
 * 
 */
package com.user.response;

import com.CommonResponse;
import com.user.bean.UserBean;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Santhosh
 *
 */
@Getter
@Setter
public class UserSaveResponse extends CommonResponse {
	private UserBean userBean;	
}
