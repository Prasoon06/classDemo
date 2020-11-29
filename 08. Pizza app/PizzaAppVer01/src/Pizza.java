
public class Pizza {
	String name;
	double price;
	String size;
	String crust;
	String toppings;
	String vegToppings="none";
	String nonVegToppings="none";
	public String getVegToppings() {
		return vegToppings;
	}
	public void setVegToppings(String vegToppings) {
		this.vegToppings = vegToppings;
	}
	public String getNonVegToppings() {
		return nonVegToppings;
	}
	public void setNonVegToppings(String nonVegToppings) {
		this.nonVegToppings = nonVegToppings;
	}
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCrust() {
		return crust;
	}
	public void setCrust(String crust) {
		this.crust = crust;
	}
	
	
}
