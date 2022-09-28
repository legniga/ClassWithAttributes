package classesWithAttributes;

public class Product {
	 private int id;
     private String name;
	 private String description;
	 private double price;
	 private  int stockAmount;
	 private String color;
	 private String code;
	
	//GETTER
	public int getId() {
		return id;
	}
	//SETTER
	public void setId(int id) {
		
	this.id=id;
	}
	public String getName() {
		return getName();
	}
	public void setName(String name) {
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getCode() {
		return id + name.substring(0,1);
	
	}

	
	
}
