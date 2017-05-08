package cl.duoc.innovacion.smartshopp.persistence.exceptions;

public class PersistenceException extends Exception {

	private static final long serialVersionUID = 1L;

	private int code;
	private String nativeMessage;

	public PersistenceException(String message) {
		super(message);
	}

	public PersistenceException(int code, String message) {
		super(message);
		this.code = code;
	}

	public PersistenceException(int code, String message, String nativeMessage) {
		super(message);
		this.code = code;
		this.nativeMessage = nativeMessage;

	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNativeMessage() {
		return nativeMessage;
	}

	public void setNativeMessage(String nativeMessage) {
		this.nativeMessage = nativeMessage;
	}

}
