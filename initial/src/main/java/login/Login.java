package login;

public class Login {

	private Status status;
	private Account account;
	
	public Login(Status status, Account account) {
		super();
		this.status = status;
		this.account = account;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}

}
