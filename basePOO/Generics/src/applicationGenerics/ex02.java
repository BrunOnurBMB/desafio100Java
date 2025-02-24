package applicationGenerics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entitiesGenerics.ProductEX02;
import servicesGenerics.CalculationServiceEX02;

public class ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<ProductEX02> list = new ArrayList<>();
		
		String path =  "C:\\Temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				
				list.add (new ProductEX02(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			ProductEX02 x = CalculationServiceEX02.max(list);
			System.out.println("Max:");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}		
	}
}
