package br.com.principal.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestionException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3890528352190562927L;
		
	public BadRequestionException() {
		super();				
	}
	
	public BadRequestionException(String message) {
		super(message);
	}
	
	public BadRequestionException(Throwable cause) {
		super(cause);
	}
	
	public BadRequestionException(String message, Throwable cause) {
		super(message,cause);
	}	
	

}
