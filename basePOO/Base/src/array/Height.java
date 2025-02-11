package array;

import java.util.Locale;
import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, sum;
		double AVG;
		AVG = 0;
		sum = 0;
		
		System.out.println("Insert the number of people who are included:");
		N = sc.nextInt();
		sc.nextLine();
		
		double[] vetHeight = new double[N];
		int[] vetAge = new int [N];
		String[] vetName = new String[N];
		
		System.out.println("Insert the name, age, and height of each person.");
		System.out.println();
		for (int i = 0; i < N; i++) {
			System.out.println("** New person:" + " **");
			
			System.out.println("Name:");
			vetName[i] = sc.nextLine();
			System.out.println("Age:");
			vetAge[i] = sc.nextInt();
			System.out.println("Height:");
			vetHeight[i] = sc.nextDouble();
			sc.nextLine();
			
			System.out.println();
		}
		
		for (int i = 0; i < vetHeight.length; i++) {
			AVG += vetHeight[i];
			
			sum += (vetAge[i] < 16) ? 1 : 0;
			
			if(vetAge[i] < 16) {
				System.out.println(vetName[i]);
			}	
		}
		System.out.println("Average height: " + String.format("%.2f", (AVG / vetHeight.length)));
		System.out.println("Person with less 16 years: " + (sum * 100)/vetAge.length + "%");
	
		sc.close();
	}
}