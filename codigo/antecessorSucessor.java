package codigo;

import java.util.Scanner;

public class antecessorSucessor {
	public static void main(String[] args) {
		
		int n, suc, ant;
		
		Scanner in = new Scanner(System.in);
		System.out.println("coloque um valor:");
		n = in.nextInt();
		suc = n + 1;
		ant = n - 1;
		System.out.println("O antecessor de " + n + " é: " + ant + "E o sucessor é: " + suc);
		in.close();
	}
}
