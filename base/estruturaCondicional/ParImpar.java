package estruturaCondicional;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A;
		
		System.out.println("insira um numero postivo ou negativo:");
		A = sc.nextInt();
		if (A % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		sc.close();

	}

}
