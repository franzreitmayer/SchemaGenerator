package eu.reitmayer.schemagen.lang;

public class SchemaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SchemaException() {
		super();
	}

	public SchemaException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
	}

	public SchemaException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public SchemaException(String arg0) {
		super(arg0);
	}

	public SchemaException(Throwable arg0) {
		super(arg0);
	}

	
}
