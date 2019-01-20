/**
 * 
 */
package com.user.response;

import com.CommonResponse;
import com.user.bean.UserBean;

/**
 * @author Santhosh
 *
 */
public class UserSaveResponse extends CommonResponse {
	private UserBean userBean;

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

}
