package lacosderepeticao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		int num;
		System.out.println("digite um numero:");
		
		Scanner leia = new Scanner (System.in);
		num = leia.nextInt();
		
		for (int contador=1; contador <= 10; contador++) {
			System.out.println(contador + "X"+ num + "=" +contador*num);
		}
	}

}
