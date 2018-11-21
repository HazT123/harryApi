package login;

public class Status {
	
	private final int code;
	private final String message;
	private final boolean error;
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public boolean getError() {
		return error;
	}

	public Status(int code, String message, boolean error) {
		super();
		this.code = code;
		this.message = message;
		this.error = error;
	}

}