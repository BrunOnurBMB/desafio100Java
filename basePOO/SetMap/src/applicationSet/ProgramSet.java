package applicationSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {

	public static void main(String[] args) {

		// Set<String> set = new HashSet<>(); HashSet + rápido (operaçãoes O(log(1)) porem não garante a ordem
		
		// Set<String> set = new TreeSet<>(); TreeSet + lento (operações O(log(n)) em árvore rubro-negra) porem ordena os dados
		
		Set<String> set = new LinkedHashSet<>(); // linkedhashSet Velocidade média. Mantem a ordem que os items são inseridos.
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		// set.remove("Tablet"); remove o item.
		
		/* 
		set.removeIf(x -> x.length() >= 3); Remove re acordo com o que o pedicado pede
		set.removeIf(x -> x.charAt(0) == 'T');
		 */
		
		
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println();
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);

	}

}
