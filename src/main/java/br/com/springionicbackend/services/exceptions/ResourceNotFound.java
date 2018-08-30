package br.com.springionicbackend.services.exceptions;

public class ResourceNotFound extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public ResourceNotFound(String msg) {
		super(msg);
	}
	
	public ResourceNotFound(String msg, Throwable cause) {
		super(msg, cause);
}

}
