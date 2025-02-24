package praticeSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		System.out.println("How many students for course A?");
		int students = sc.nextInt();
		for(int i = 0; i < students; i++) {
			courseA.add(sc.nextInt());
		}
		
		System.out.println("How many students for course B?");
		students = sc.nextInt();
		for(int i = 0; i < students; i++) {
			courseA.add(sc.nextInt());
		}
		
		System.out.println("How many students for course C?");
		students = sc.nextInt();
		for(int i = 0; i < students; i++) {
			courseA.add(sc.nextInt());
		}
		
		int totalStudents = courseA.size() + courseB.size() + courseC.size();
		
		System.out.println();
		System.out.print("Total students:" + totalStudents);
		
		sc.close();
	}
}
