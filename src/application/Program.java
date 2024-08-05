package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Enter account data ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double n = sc.nextDouble();
		account.withdraw(n);
		}
		
		
		catch(DomainException e) {
			System.out.print("Withdraw error: "+ e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.print("Error unexpected input");
		
		}
		
		
		sc.close();
	}

}
