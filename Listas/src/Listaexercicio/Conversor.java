package Listaexercicio;

import java.util.Scanner;

public class Conversor {

	
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			double r;
			int moeda;
			System.out.println("Digite um valor em real:");
			r = leia.nextDouble();
			System.out.println("Escolha a moeda que você vai converter");
			System.out.println("1) Dolar " + "         2) Libra" + "         3) Peso        ");
			moeda = leia.nextInt();
			if (moeda == 1) {
				System.out.println("O valor em dolar é:" + r * 1.87);
			} else if (moeda == 2) {
				System.out.println("O valor em libra é;" + r * 3.05);
			} else if (moeda == 3) {
				System.out.println("O valor em peso é:" + r * 1.4);
			}
			leia.close();
		}
	

	}


