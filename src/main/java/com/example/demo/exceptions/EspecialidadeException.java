/**
 * 
 */
package com.example.demo.exceptions;

/**
 * @author Samuel Rollemberg
 *
 */
public class EspecialidadeException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public EspecialidadeException(String message) {
		super(message);
	}

	public EspecialidadeException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
}
