/**
 * 
 */
package com;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Santhosh
 *
 */
@Getter
@Setter
public class CommonResponse {

	private Integer status;
	private String error;
	private String message;
}
