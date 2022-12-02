package classicaslaço;

import java.util.Scanner;
public class fibonacci {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int proximo, posicao, antes, atual, termo;
		System.out.print("Digite até qual termo a sequência de Fibonacci irá:");
		termo=in.nextInt();
		posicao=1;
		antes=0;
		atual=1;
		System.out.print(atual);
		do {
			proximo=antes+atual;
			System.out.print(" "+proximo);
			antes=atual;
			atual=proximo;
			posicao++;
		}while(posicao<termo);
	}
}
