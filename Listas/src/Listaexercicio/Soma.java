package Listaexercicio;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leia = new Scanner(System.in);
    int num;
    int num2;
    int soma;
	System.out.println("Digite um número:");
    num = leia.nextInt();
    System.out.println("Digite o segundo número:");
    num2 = leia.nextInt();
    leia.close();
    soma = num + num2;
    System.out.println("A soma dos dois é:"+ soma);
	}
}
