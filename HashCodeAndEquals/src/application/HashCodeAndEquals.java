package application;

import entities.Client;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";
		String c = "Maria";
		
		System.out.println(a.hashCode()); // pode ocorrer colisões.
		System.out.println(b.hashCode()); // pode ocorrer colisões.
		System.out.println("String a with String b :" + a.equals(b)); // 100%
		System.out.println("String a with String c :" +a.equals(c)); // 100%
		System.out.println(a == c);
		
		System.out.println();
		
		String aa = new String("Maria");
		String bb = new String("Maria");
		System.out.println("String aa with String bb :" + aa == bb);
		
		System.out.println();
			
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		Client c3 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println();		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1 == c3);
	}
}