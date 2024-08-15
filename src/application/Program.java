package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static final double DOLLAR = 5.16;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos dólares serão comprados?");
		double dollars = sc.nextDouble();

		double reais = converte(dollars);

		System.out.printf("Valor a ser pago em reais = %.2f%n", reais);

		sc.close();
	}

	public static double converte(double dollars) {
		return dollars * DOLLAR;
	}

}
