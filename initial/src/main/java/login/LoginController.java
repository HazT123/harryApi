package login;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	private final boolean error = false;
	private static final String message = "Success";
	private final int code = 200;
    
    private final String accountRef = "500222";
    private final String emailAddress = "harry.t.123@hotmail.com";
    private final String accessToken = "openSesame";
    private final AtomicLong jsessionId = new AtomicLong();
    private final String[] sessionCookies = {"cookie1", "cookie2"};
    
    @GetMapping("/test-login")
    public Login login(@RequestParam(value="username", defaultValue="user") String username, @RequestParam(value="password", defaultValue="pass") String password) {
    	if (username.equalsIgnoreCase("harry") && password.equalsIgnoreCase("password")) {
    		Status status = new Status(code, message, error);
    		Account userAccount = new Account(accountRef, emailAddress, accessToken, jsessionId.incrementAndGet(), sessionCookies);
    		return new Login(status, userAccount);
    	} 
    	Status status = new Status(404, "user not found", true);
		Account emptyAccount = null;
    	return new Login(status, emptyAccount);
    }
    
}
