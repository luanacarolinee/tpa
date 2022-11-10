package Fixacao;

import java.util.Scanner;

public class Tabuada {
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, i = 1, resultado;
		String repetir = "S";
		
		while(repetir.equalsIgnoreCase("S")) {
			System.out.println("Qual tabuada deseja calcular?");
			n = in.nextInt();
			while (i <= 10) {
				resultado = n * i;
				System.out.println(n + " x " + i + " = " + resultado);
				i++;
}
			i = 0;
			repetir = in.next();
		}
		in.close();
	}
}
	

