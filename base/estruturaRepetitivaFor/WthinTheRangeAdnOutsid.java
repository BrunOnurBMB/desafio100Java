package estruturaRepetitivaFor;

import java.util.Scanner;

public class WthinTheRangeAdnOutsid {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int N, X, in, out;
	in = 0;
	out = 0;
	
	System.out.println("How many numbers so you wanna add?");
	N = sc.nextInt();
	
	System.out.println("Insert de first number:");
	
	for (int i = 1; i <= N; i++) {
		
		X = sc.nextInt();
		
		if(X >= 10 && X <= 20) {
			in = in + 1;
		}else {
			out = out + 1;
		}
		
		System.out.println("Insert de next number:");
		
	}
	
	System.out.println(in + " in");
	System.out.println(out + " out");
	
	sc.close();		
	}
}
