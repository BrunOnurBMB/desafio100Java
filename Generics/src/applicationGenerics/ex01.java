package applicationGenerics;

import java.util.Scanner;

import entitiesGenerics.PrintServiceEX01;

public class ex01 {
	
	/*
	 O generics permite que classes, interfaces e métodos possa ser paramentrizador por tipo. Seus benefícios são:
	 	- Reuso
	 	- Type Safety
	 	- Performance
	  */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		PrintServiceEX01<Integer> ps = new PrintServiceEX01<>();
		
		System.out.println("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		int firstValue = ps.first();
		System.out.println("First: " + firstValue);
		
		sc.close();
	}

}
