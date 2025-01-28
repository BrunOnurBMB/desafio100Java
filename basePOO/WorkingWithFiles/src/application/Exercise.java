package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercise {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the root file path: ");
		String strFilePath = sc.nextLine();
		
		File file = new File(strFilePath);
		String rootDirectoryPath = file.getParent();
		
		boolean createdFolder = new File(rootDirectoryPath + "\\out").mkdir();
		String sumaryFile = rootDirectoryPath + "\\out\\sumary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(strFilePath))){
			
			String itens = br.readLine();
			while(itens != null) {
				
				String[] item = itens.split(",");
				String name = item[0];
				double price = Double.parseDouble(item[1]);
				int quantity = Integer.parseInt(item[2]);
				
				list.add(new Product(name, price, quantity));
				
				itens = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(sumaryFile))){
				
				for(Product product : list) {
					bw.write(product.getName() + " ," + String.format("%.2f", product.totalPrice()));
					bw.newLine();
				}
			}
			catch(IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
