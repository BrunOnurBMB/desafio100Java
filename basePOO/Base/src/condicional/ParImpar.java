package condicional;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		String msg;
		
		System.out.println("insira um numero postivo ou negativo:");
		A = sc.nextInt();
		
		msg = (A % 2 == 0) ? "par" : "impar";
		System.out.println(msg);
		
		sc.close();

	}

}
