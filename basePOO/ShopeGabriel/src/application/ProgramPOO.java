package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class ProgramPOO {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth date: ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		Order order = new Order(LocalDate.now(), null, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(productName, productPrice, quantity);
			
			order.addItem(orderItem);
			sc.nextLine();
			System.out.println("---------------");
		}
		

		double total = 0.0;
		for(OrderItem orderItem : order.getList()) {
			total += orderItem.subTotal();
		}
		
		System.out.println("Subtotal: " + total);
		System.out.print("How many installments would you like to make? ");
		int installments = sc.nextInt();
		
		order.setInstallment(installments);
		
		System.out.println();
		System.out.println(order);
		sc.close();
	}

}
