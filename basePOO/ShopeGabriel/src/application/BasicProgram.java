package application;

import java.util.Locale;
import java.util.Scanner;

public class BasicProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" -- Bem vindo a loja do Bifano --");
		System.out.println();
		
		System.out.print("Ente com o valor do pedido: ");
		double valorPedido = sc.nextDouble();
		
		System.out.print("Entre com a quantidade de parcelas: ");
		int quantidadeParcelas = sc.nextInt();
		double valorTotalParcelado = 0;
		double valorParcela = 0;
		double porcentagemParcela = (quantidadeParcelas < 4) ?  0 :
							  (quantidadeParcelas < 6) ? 0.4 :
							  (quantidadeParcelas < 9) ? 0.8 :
							  (quantidadeParcelas < 13) ? 0.16 :
							   0.32;   				  
		
		valorTotalParcelado = valorPedido + valorPedido * porcentagemParcela;
		valorParcela = valorTotalParcelado / quantidadeParcelas;		
		
		System.out.printf("O valor das parcelas é de: R$ " + String.format("%.2f", valorParcela));
		System.out.println();
		System.out.printf("O valor total parcelado é de: R$ " + String.format("%.2f", valorTotalParcelado));
		sc.close();
	}

}
