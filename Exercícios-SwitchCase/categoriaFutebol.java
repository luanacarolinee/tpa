package escolhaCaso;

import java.util.Scanner;

public class categoriaFutebol {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Informe a idade do aluno:");
		idade = in.nextInt();
		
		switch(idade) {
			case 6:
				System.out.println("Aluno categoria: Dente de Leite");
				break;
			case 7:
				System.out.println("Aluno categoria: Júnior");
				break;
			case 8:
				System.out.println("Aluno categoria: Júnior Max");
				break;
			case 9:
				System.out.println("Aluno categoria: Júnior Master");
				break;
			case 10:
				System.out.println("Aluno categoria: Master");
				break;
			default:
				System.out.println("A escola só aceita alunos entre 6 a 10 anos de idade.");
		}
		in.close();
	}
}
