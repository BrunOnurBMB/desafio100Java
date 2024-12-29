package estruturaRepetitivaFor;

import java.util.Locale;
import java.util.Scanner;

public class AverageGrade {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double grade1, grade2, grade3, media;
		grade1 = 0;
		grade2 = 0;
		grade3 = 0;
		media = 0;
		
		System.out.println("how many grades you wanna to add?");
		N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.println("Add " + "1º" + " grade:");
			grade1 = sc.nextDouble();
			System.out.println("Add " + "2º" +" grade");
			grade2 = sc.nextDouble();
			System.out.println("Add " + "3º" +" grade");
			grade3 = sc.nextDouble();
			
			media = (grade1 * 2 + grade2 * 3 + grade3 * 5) / 10; 
			System.out.println("average = " + String.format("%.1f", media));
			System.out.println();
		}
		
		sc.close();

	}

}
