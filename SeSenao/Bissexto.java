package SeSenao;

import java.util.Scanner;

public class Bissexto {

        static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoNasc;
		
		System.out.println("Digite o ano de nascimento:");
		anoNasc = in.nextInt();
		
		if (anoNasc % 4 == 0) {
			System.out.println("Esse ano é bissexto.");
		} else {
			System.out.println("Esse ano não é bissexto.");
		}
		in.close();
	}
}
