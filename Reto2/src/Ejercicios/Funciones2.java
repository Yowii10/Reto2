package Ejercicios;

import java.util.Scanner;

public class Funciones2 {
	public static void submenuTemperatura(Scanner sc) {
		int opcion=0;
		do {
		System.out.println("Selecciona la conversion de longitud");
		System.out.println("1.Celsius a Fahrentheit");
		System.out.println("2.Fahrentheit a Celsius");
		System.out.println("0.Salir");

		int numero= Ej25_22.dimeEntero("opcion", sc);
		switch(numero){
		case 1:
			double celsius = Ej25_22.dimeDouble("Escribe el numero de grados celsius", sc);
			System.out.println(celsiusaFahrentheit(celsius) + "ºF"); 
			break;
		case 2:
			double fahrenheit = Ej25_22.dimeDouble("Escribe el numero de grados fahrenheit", sc);
			System.out.println(fahrentheiraCelsius(fahrenheit) + "ºC"); 
			break;
		}
		}while(opcion!=0);
	}
	public static void submenuVolumen(Scanner sc) {
		int opcion=0;
		do {
		System.out.println("Selecciona la conversion de longitud");
		System.out.println("1.Litros a Galones");
		System.out.println("2.Galones a Litros");
		System.out.println("0.salir");
		int numero= Ej25_22.dimeEntero("opcion", sc);
		switch(numero){
		case 1:
			double litros = Ej25_22.dimeDouble("Escribe el numero de litros", sc);
			System.out.println(litrosaGalones(litros) + "L"); 
			break;
		case 2:
			double galones = Ej25_22.dimeDouble("Escribe el numero de galones", sc);
			System.out.println(galonesaLitros(galones) + "G"); 
			break;
		}
		}while(opcion!=0);
	}
public static double celsiusaFahrentheit(double grados) {
	return grados*9/5+32;
			
		}
public static double fahrentheiraCelsius(double grados) {
	return grados-32*5/9;
		
	}
public static double litrosaGalones(double litros) {
	return litros*0.264172;
		
	}
public static double galonesaLitros(double galones) {
	return galones*3.785;
		
	}
		
}
