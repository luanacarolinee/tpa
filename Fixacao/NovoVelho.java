package Fixacao;

import  java.util.Scanner;

public class NovoVelho {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = 1, idade, idadeNovo, idadeVelho;
		String nome, nomeNovo, nomeVelho;
		
		 System.out.println("Digite o nome do usuario:");
		 nomeVelho = in.next();
		 
		 System.out.println("Digite a idade do usuario:");
		 idadeVelho = in.nextInt();
		 
		 nomeNovo = nomeVelho;
		 idadeNovo = idadeVelho;
 
		 while (i <= 10) {
			 System.out.println("Digite o nome do " + i + " usuário:");
			 nome = in.next();
			 
			 System.out.println("Digite a idade do " + i + " usuário:");
			 idade = in.nextInt();
			 
			 if (idade > idadeVelho) {
				 nomeVelho = nome;
				 idadeVelho = idade;
			 } else if (idade < idadeNovo) {
				 nomeNovo = nome;
				 idadeNovo = idade;
			 }
			 i++;
		 }
		 System.out.println("Usuario mais velho: " + nomeVelho + "\nIdade: " + idadeVelho);
		 System.out.println("Usuario mais novo: " + nomeNovo + "\nIdade: " + idadeNovo);
		 in.close();
	}

}
