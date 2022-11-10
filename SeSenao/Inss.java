package SeSenao;

import java.util.Scanner;

public class Inss {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double salario, inss, salaLiquido;
		
		System.out.println("Digite o salário:");
		salario = in.nextDouble();
		
		if (salario <= 2500) {
			inss = (salario * 9) / 100;
		} else {
			inss = (salario * 11) / 100;
		}
		
		salaLiquido = salario - inss;
		
		System.out.println("Valor devido ao INSS: " + inss + " R$");
		System.out.println("Salário Liquido: " + salaLiquido + " R$");
		
		in.close();
	}

}
