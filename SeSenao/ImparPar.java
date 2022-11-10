package SeSenao;

import java.util.Scanner;

public class ImparPar {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número:");
		n = in.nextInt();
		if (n % 2 == 0) {
			System.out.println("Esse número é par:");
		} else {
			System.out.println("Esse número é ímpar:");
		}
		in.close();
	}

}
