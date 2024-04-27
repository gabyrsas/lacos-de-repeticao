package lacosderepeticao;

import java.util.Scanner;

public class Whilee {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade; 
		int idade20 = 0;
		int idade50 = 0;
		
		System.out.println("digite sua idade:");
		idade = leia.nextInt();
		
		while(idade >=0) {
			if (idade < 21) {
				idade20++;
			
			}else if (idade>50){
				idade50++;
			}
		
		System.out.println("digite a idade da proxima pessoa");
		idade = leia.nextInt();
		}
		System.out.println("total de pessoas com menos de 21 anos  " + idade20);
		System.out.println("total de pessoas com mais de 50 anos "+ idade50 );
		}
		
	}


