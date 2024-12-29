package estruturaSequencial001;

import java.util.Locale;
import java.util.Scanner;

public class IdentificaPorCodigoCalculaValorEQuantidade {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int Id, Quant;
		double Cust, Tot;
		
		System.out.println("Insira o cod do item, sua quantidade e seu valor");
		Id = sc.nextInt();
		Quant = sc.nextInt();
		Cust = sc.nextDouble();
		Tot = Cust * Quant;
		System.out.println("Insira o cod, quantidade e valor do item 2");
		Id = sc.nextInt();
		Quant = sc.nextInt();
		Cust = sc.nextDouble();
		Tot = Tot + (Quant * Cust);
		
		System.out.println("Valor total a pagar: R$ " + String.format("%.2f", Tot));
				
		sc.close();

	}

}
