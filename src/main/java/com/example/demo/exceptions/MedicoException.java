/**
 * 
 */
package com.example.demo.exceptions;

/**
 * @author linux
 *
 */
public class MedicoException extends Exception{

	private static final long serialVersionUID = 1L;

	public MedicoException(String message) {
		super(message);
	}
	
	public MedicoException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
