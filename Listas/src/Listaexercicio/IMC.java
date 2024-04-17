package Listaexercicio;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			String sexo;
			double h;
			double p;
			System.out.println("Qual o seu sexo?");
			sexo = leia.next();
			System.out.println("Qual a sua altura?");
			h = leia.nextDouble();
			if (sexo.equals("M") || sexo.equals("m")) {
				p = (72.7 * h) - 44.7;
				System.out.println("seu peso ideal é:" + p);
			} else if (sexo.equals("F") || sexo.equals("f")) {
				p = (62.1 * h) - 44.7;
				System.out.println("seu peso ideal é:" + p);
			}
			leia.close();

	}

}
