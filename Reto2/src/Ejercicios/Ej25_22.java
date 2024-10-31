package Ejercicios;

import java.util.Scanner;

public class Ej25_22 {

	public static boolean esInt(String num) {
		try {
			Integer.parseInt(num);
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public static boolean esDouble(String num) {
		try {
			Double.parseDouble(num);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {

				System.out.println(texto);
				String s = sc.nextLine();
				int n = Integer.parseInt(s);
				return n;
			} catch (Exception e) {
				System.out.println("Numero  no valido");
			}

		} while (true);
	}
	
	public static double dimeDouble(String texto, Scanner sc) {
		do {
			try {

				System.out.println(texto);
				String s = sc.nextLine();
				double n = Double.parseDouble(s);
				return n;
			} catch (Exception e) {
				System.out.println("Numero  no valido");
			}

		} while (true);
	}
	
	public static boolean esBisiesto(int anyo) {

		if ((anyo %4==0&&anyo%100!=0)||anyo%400==0) {
		return true;
	}else{
		return false;
	}
		
}
}
