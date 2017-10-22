
public class Receipt {
	
	private float price;
	private String description;
	
	public Receipt(float price, String description){
		this.price = price;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Receipt{" +
				"price=" + price +
				", description='" + description + '\'' +
				'}';
	}

	public float getPrice(){
		return price;
	}
	
	public void setPrice(float p){
		price = p;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String d){
		description = d;
	}
	
}
