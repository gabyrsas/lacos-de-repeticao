package lacosderepeticao;

import java.util.Scanner;

public class Exerciciodois {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		int num1, num2;
		System.out.println("Digite o primeiro numero");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo numero:");
		num2 = leia.nextInt();
	
		if (num1>= num2) {
			System.out.println("o intervelo é invalido ");
		} else {
			System.out.println("numeoros multiplos de 3 e 5 no intervalo de "+ num1+ " a " +num2+ ":");
			for (int i =  num1; i <= num2; i ++){
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println (i);
				}
				
			}
		}
		
	}

}
