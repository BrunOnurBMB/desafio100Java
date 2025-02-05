package entities;

public class OrderItem extends Product{

	private Integer quantity;
	
	public OrderItem() {
		super();
	}

	public OrderItem(String name, Double price, Integer quantity) {
		super(name, price);
		this.quantity = quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public double subTotal() {
		return price * quantity;
	}
}
