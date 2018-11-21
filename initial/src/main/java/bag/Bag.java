package bag;

import java.util.ArrayList;

public class Bag {
	
	private Status status;
	private ArrayList<Products> products;
	
	public Bag(Status status, ArrayList<Products> products) {
		super();
		this.status = status;
		this.products = products;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public ArrayList<Products> getProducts() {
		return products;
	}
	
	public void setProducts( ArrayList<Products> products) {
		this.products = products;
	}
	
}
