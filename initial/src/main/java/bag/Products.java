package bag;

public class Products {

	private final String sku9;
	private final int qty;
	
	public String getSku9() {
		return sku9;
	}
	
	public int getQty() {
		return qty;
	}

	public Products(String sku9, int qty) {
		super();
		this.sku9 = sku9;
		this.qty = qty;
	}	
	
}
