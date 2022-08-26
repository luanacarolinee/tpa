package escolhaCaso;

import java.util.Scanner;

public class PorcentagemMencao {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		float totalAlunos, mb, b, r, i, porcMb, porcB, porcR, porcI;
		
		System.out.println("Digite a quantidadede alunos com menção MB:");
		mb = in.nextInt();
		System.out.println("Digite a quantidadede alunos com menção B:");
		b = in.nextInt();
		System.out.println("Digite a quantidadede alunos com menção R:");
		r = in.nextInt();
		System.out.println("Digite a quantidadede alunos com menção I:");
		i = in.nextInt();
		
		totalAlunos = mb + b + r + i;
		porcMb = mb * 100 / totalAlunos;
		porcB = b * 100 / totalAlunos;
		porcR = r * 100 / totalAlunos;
		porcI = i * 100 / totalAlunos;
		
		System.out.println("Porcentagens de cada Menção:");
		System.out.println("MB: " + porcMb + "%");
		System.out.println("MB: " + porcB + "%");
		System.out.println("MB: " + porcR + "%");
		System.out.println("MB: " + porcI + "%");
		System.out.println("Quantidade total de alunos: " + totalAlunos);
		
//		System.out.println("Porcentagens de cada Menção: " 
//				+ "\nMB: " + porcMb + "%" 
//				+ "\nB: " + porcB + "%"
//				+ "\nR: " + porcR + "%"
//				+ "\nI: " + porcI + "%");
		in.close();
	}
}
