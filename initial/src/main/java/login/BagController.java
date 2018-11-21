package login;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bag.Bag;
import bag.Products;
import bag.Status;

@RestController
public class BagController {
	
	private final boolean error = false;
	private static final String message = "Success";
	private final int code = 200;
    
    @GetMapping("/test-bag")
    public Bag bag(@RequestParam(value="accessToken", defaultValue="null") String accessToken) {
    	if (accessToken.equals("openSesame")) {
    		
    		Status status = new Status(code, message, error);
    		ArrayList<Products> products = new ArrayList<Products>();
    		products.add(new Products("123456789", 1));
    		products.add(new Products("123456789", 2));
    		products.add(new Products("123456789", 1));
    		return new Bag(status, products);
    		
    	} 
    	
    	Status status = new Status(400, "unknown access token", true);
		ArrayList<Products> products = new ArrayList<Products>();
    	return new Bag(status,products);
    	
    }

}
