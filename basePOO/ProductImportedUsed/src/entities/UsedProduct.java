package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

	private LocalDate manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate manufacturedDate) {
		super(name, price);
		this.manufactureDate = manufacturedDate;
	}

	public LocalDate getManufacturedDate() {
		return manufactureDate;
	}
	
	public void setManufactureDate (LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String priceTag() {
		return 
				getName()
			   + " $ "
			   + String.format("%.2f", price)
			   + " (Manufactured date: "
			   + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
			   + ")";
	}
}
