package praticeMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> votes = new LinkedHashMap<>();
		
		System.out.print("Enter with file full path: ");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String elements = br.readLine();
			while(elements != null) {
				
				String[] element =  elements.split(",");
				String name = element[0];
				int count = Integer.parseInt(element[1]);
				
				if(votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				}
				else {
					votes.put(name, count);
				}
				
				elements = br.readLine();
			}
			
			for(String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}
