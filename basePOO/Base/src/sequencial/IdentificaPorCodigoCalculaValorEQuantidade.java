package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class IdentificaPorCodigoCalculaValorEQuantidade {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int id, quantidade;
		double custo, tot;
		
		System.out.println("Insira o cod do item, sua quantidade e seu valor");
		id = sc.nextInt();
		quantidade = sc.nextInt();
		custo = sc.nextDouble();
		tot = custo * quantidade;
		System.out.println("Insira o cod, quantidade e valor do item 2");
		id = sc.nextInt();
		quantidade = sc.nextInt();
		custo = sc.nextDouble();
		tot = tot + (quantidade * custo);
		
		System.out.println("Valor total a pagar: R$ " + String.format("%.2f", tot));
				
		sc.close();
	}

}
