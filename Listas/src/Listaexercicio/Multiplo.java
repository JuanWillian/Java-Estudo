package Listaexercicio;

import java.util.Scanner;

public class Multiplo {

	
		public static void main(String[] args) {
		    Scanner leia = new Scanner (System.in);	
		    double A, B; 
		    System.out.println("Digite dois numeros");
		    B = leia.nextDouble();
		    A = leia.nextDouble();
			if (A%B == 0) {
				System.out.println("O numero " + A +" é multiplo de " + B);
			}else {
		        System.out.println("O numero " + A + " não é multiplo de "+ B);	
			}
			leia.close();
			}

		
	}


