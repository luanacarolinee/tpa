package Fixacao;

import java.util.Scanner;

public class Lucro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double produto, margemLucro, precoVenda;
		String repetir = "S";
		
		while (repetir.equalsIgnoreCase("S")) {
			System.out.println("coloque o preço do produto:");
			produto = in.nextDouble();
			
			System.out.println("Digite o lucro desejada:");
			margemLucro = in.nextDouble();
			
			precoVenda = (margemLucro / 100) * produto + produto;
			
			System.out.println("O preço de venda do produto sera de R$ " + precoVenda);
			
			System.out.println("Deseja calcular novamente? (Sim/Não)");
			repetir = in.next();
		}
		in.close();
	}
}


