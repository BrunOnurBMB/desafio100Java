package Vet;

import java.util.Locale;
import java.util.Scanner;

public class Merchant {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, count, aboveProfit, midProfit, overProfit;
		count = 0;
		aboveProfit = 0;
		midProfit = 0;
		overProfit = 0;
		
		double profit, totalBuy, totalSell;
		profit = 0;
		totalBuy = 0;
		totalSell = 0;
		
		
		
		System.out.println("How mani products are goin to be added?");
		N = sc.nextInt();
		sc.nextLine();
		
		String vetProduct[] = new String[N];
		double vetSellPrice[] = new double[N];
		double vetBuyPrice[] = new double[N];
		
		System.out.println();
		System.out.println("----------");
		System.out.println();
		
		for (int i = 0; i < N; i++) {
			count = i + 1;
			System.out.println(count + "st product:");
			
			System.out.println("Product name:");
			vetProduct[i] = sc.nextLine();
			System.out.println("Product buy price:");
			vetBuyPrice[i] = sc.nextDouble();
			System.out.println("Product sell price:");
			vetSellPrice[i] = sc.nextDouble();
			sc.nextLine();
			
			System.out.println();
			System.out.println("----------");
			System.out.println();
		}
		
		System.out.println("------  Report  ------");
		for (int i = 0; i < N; i++) {
			profit = ((vetSellPrice[i] * 100) / vetBuyPrice[i]) - 100;
			if(profit < 10) {
				aboveProfit++;
			}else if(profit < 20) {
				midProfit++;
			}else {
				overProfit++;
			}
		}
		System.out.println("Profit above 10%: " + aboveProfit);
		System.out.println("Profit between 10% and 20%: " + midProfit);
		System.out.println("Profit over 20%: " + overProfit);
		
		for (int i = 0; i < N; i++) {
			totalBuy = totalBuy + vetBuyPrice[i];
			totalSell = totalSell +  vetSellPrice[i];
			profit = 0;
			profit = totalSell - totalBuy;
		}
		System.out.println("Total purchase value: " + String.format("%.2f", totalBuy));
		System.out.println("Total sales value: " + String.format("%.2f", totalSell));
		System.out.println("Total profit: " + String.format("%.2f", profit));
		
		sc.close();
	}

}
