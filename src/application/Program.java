package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
	
	public static final double DOLLAR = 5.16;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double real = sc.nextDouble();
		real = CurrencyConverter.valorDolar;
		System.out.println("What is the dollar price? " + real);
		double d = CurrencyConverter.converte();
		d = sc.nextDouble();
		
		
		System.out.printf("How many dollar will be bought? %.2f%n", d);
		System.out.printf("Amount to be paid in reais = %.2f", real);
		
		
		sc.close();

	}

}
