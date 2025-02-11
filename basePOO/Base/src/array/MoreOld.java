package array;

import java.util.Scanner;

public class MoreOld {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, moreOld, position;
		moreOld = 0;
		position = 0;
				
		System.out.println("How many people you are goin to compare");
		N = sc.nextInt();
		sc.nextLine();
		
		String vetName[] = new String[N];
		int vetAge[] = new int[N];
		
		for (int i = 1; i <= N; i++) {
			position = i +  1;
			System.out.println("--------");
			System.out.println("Data of the " + position +"st person:");
			System.out.print("Name: ");
			vetName[i] = sc.nextLine();
			System.out.print("Age: ");
			vetAge[i] = sc.nextInt();
			sc.nextLine();
			System.out.println("");
		}
		
		System.out.println("--------");
		
		for (int i = 0; i < N; i++) {
			if(vetAge[i] > moreOld) {
				moreOld = vetAge[i];
				position = i;
			}
		}
		
		System.out.println("Person with the highest age: " + vetName[position]);
		
		sc.close();
	}
}