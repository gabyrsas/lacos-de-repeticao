package lacosderepeticao;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {

	int contador = 3;
	int numero, resultado;
	Scanner leia = new Scanner(System.in);
	
	do {
		System.out.println("digite um numero:");
		numero = leia.nextInt();
		resultado = numero*5;
		System.out.println("Resultado é:"+ resultado);
		//System.out.println(contador);
		contador--;
		
	}while(contador <=2);
	
	}

}
