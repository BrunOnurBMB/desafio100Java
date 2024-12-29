package estruturaSequencial001;

import java.util.Locale;
import java.util.Scanner;

public class SomaDoisValoresExibe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int numberOne, numberTwo;
		int soma;
		
		System.out.print("Dgite o primeiro número: ");
		numberOne = sc.nextInt();
		System.out.print("insira o próximo número: ");
		numberTwo = sc.nextInt();
		soma = (numberOne + numberTwo);
		
				
		System.out.println("A soma do valor " + numberOne + " e valor " + numberTwo + " é igual á =  " + soma);
		
		sc.close();
	}

}
