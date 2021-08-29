package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account x = new Account(1001, "jeff", 1000.0);
		Account y = new SavingsAccount(1023, "ana", 1000.0, 0.01);
		
		x.withDraw(50.0);
		System.out.println(x.getBalance());
		y.withDraw(50.0);
		
		System.out.println(y.getBalance());
		sc.close();

	}

}
