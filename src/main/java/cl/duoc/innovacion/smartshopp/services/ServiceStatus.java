package cl.duoc.innovacion.smartshopp.services;

public class ServiceStatus {

	private int code;
	private String message;
	private String nativeMessage;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getNativeMessage() {
		return nativeMessage;
	}
	public void setNativeMessage(String nativeMessage) {
		this.nativeMessage = nativeMessage;
	}
	@Override
	public String toString() {
		return "ServiceStatus [code=" + code + ", message=" + message + ", nativeMessage=" + nativeMessage + "]";
	}
	
}
