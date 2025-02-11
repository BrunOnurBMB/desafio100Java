package estruturaRepetitivaFor;

import java.util.Scanner;

public class ReadAndDisplay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  i, n;
		
		System.out.println("Insira um inteiro:");
		n = sc.nextInt();
		
		for (i = 0; i <= n ; i++) {
			
			System.out.println(n-i);
			
		}
		
		sc.close();
	}
	
}
