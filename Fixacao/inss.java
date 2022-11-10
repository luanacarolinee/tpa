package Fixacao;

import java.util.Scanner;

public class inss {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = 1;
		double salario, desconto;
		
		while (i <= 4) {
			System.out.println("Digite o salário do funcionário:");
			salario = in.nextDouble();
			if (salario < 2000) {
				desconto = salario / 100 * 8.5;
				System.out.println("O desconto foi: " + desconto + "\nO equivalente a 8,5% do salário total.");
			} else if (salario >= 2000) {
				desconto = salario / 100 * 11;
				System.out.println("O desconto foi: " + desconto + "\nO equivalente a 11% do salário total.");
			}
		              i++; 
		}
		in.close();
	}
}

