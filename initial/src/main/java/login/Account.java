package login;

public class Account {
	
	private final String accountRef;
	private final String emailAddress;
	private final String accessToken;
	private final long jsessionId;
	private final String[] sessionCookies;
	
	public String getAccountRef() {
		return accountRef;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public String getAccessToken() {
		return accessToken;
	}
	
	public long getJsessionId() {
		return jsessionId;
	}

	public String[] getSessionCookies() {
		return sessionCookies;
	}

	public Account(String accountRef, String emailAddress, String accessToken, long jsessionId, String[] sessionCookies) {
		super();
		this.accountRef = accountRef;
		this.emailAddress = emailAddress;
		this.accessToken = accessToken;
		this.jsessionId = jsessionId;
		this.sessionCookies = sessionCookies;
	}

}