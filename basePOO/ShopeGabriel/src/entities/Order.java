package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private LocalDate moment;
	private Integer installments;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(LocalDate localDate, Integer installments, Client client) {
		this.moment = localDate;
		this.installments = installments;
		this.client = client;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public Integer getInstallments() {
		return installments;
	}
	
	public Integer setInstallment(Integer installments) {
		return this.installments = installments;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getList() {
		return items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double calculateInterest() {		
		Double totalPrice = 0.0;
		double installmentPercentage = (installments < 4) ?  0 :
			  (installments < 6) ? 0.4 :
			  (installments < 9) ? 0.8 :
			  (installments < 13) ? 0.16 :
			   0.32; 
		
		for (OrderItem item : items) {
			totalPrice += item.subTotal();
		}
		
		return totalPrice += totalPrice * installmentPercentage;
	}
	
	public Double calculateInstallmentAmount() {
		return calculateInterest() / installments;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(moment.format(dtf) + "\n");
		sb.append("Order installments: ");
		sb.append(installments + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item.getName() + " ");
			sb.append(item.getQuantity()+ "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", calculateInterest()) + "\n");
		sb.append("Total of installments: ");
		sb.append(String.format("%.2f", calculateInstallmentAmount()));
		return sb.toString();
	}
}
