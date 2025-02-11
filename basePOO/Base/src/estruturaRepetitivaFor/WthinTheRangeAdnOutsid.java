package estruturaRepetitivaFor;

import java.util.Scanner;

public class WthinTheRangeAdnOutsid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, x, in, out;
		in = 0;
		out = 0;
		
		System.out.println("How many numbers so you wanna add?");
		n = sc.nextInt();
		
		System.out.println("Insert de first number:");
		
		for (int i = 1; i <= n; i++) {
			x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				in += 1;
			}else {
				out += 1;
			}
			System.out.println("Insert de next number:");
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();		
		}
}
