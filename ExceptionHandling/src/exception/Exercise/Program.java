package exception.Exercise;

import java.util.Locale;
import java.util.Scanner;

import exception.entities.Account;
import exception.exception.BusinessException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account = new Account();

		System.out.println("Enter account data: ");

		System.out.print("Number: ");
		int numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		account = new Account(numberAccount, holder, initialBalance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for wirhdraw: ");
		double amount = sc.nextDouble();
		
		try {
			account.withdraw(amount);
			System.out.printf("Novo saldo: %.2f%n", account.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}