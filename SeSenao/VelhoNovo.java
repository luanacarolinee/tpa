package SeSenao;

import java.util.Scanner;

public class VelhoNovo {

	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int idade, idadeNovo, idadeVelho;
        String nome, nomeNovo, nomeVelho;
        
        System.out.println("Digite o nome do 1° usuário:");
        nome = in.next();
        nomeNovo = nome;
        nomeVelho = nome;
        
        System.out.println("Digite a idade do 1° usuário:");
        idade = in.nextInt();
        idadeNovo = idade;
        idadeVelho = idade;
        
        System.out.println("Digite o nome do 2° usuário:");
        nome = in.next();
        System.out.println("Digite a idade do 2° usuário:");
        idade = in.nextInt();
        
        if (idade > idadeVelho) {
        	nomeVelho = nome;
        	idadeVelho = idade;
        } else if (idade < idadeNovo) {
        	nomeNovo = nome;
        	idadeNovo = idade;
        }
        
        System.out.println("Digite o nome do 3° usuário:");
        nome = in.next();
        System.out.println("Digite a idade do 3° usuário:");
        idade = in.nextInt();
        
        if (idade > idadeVelho) {
        	nomeVelho = nome;
        	idadeVelho = idade;
        } else if (idade < idadeNovo) {
        	nomeNovo = nome;
        	idadeNovo = idade;
        }
        
        System.out.println("Digite o nome do 4° usuário:");
        nome = in.next();
        System.out.println("Digite a idade do 4° usuário:");
        idade = in.nextInt();
        
        if (idade > idadeVelho) {
        	nomeVelho = nome;
        	idadeVelho = idade;
        } else if (idade < idadeNovo) {
        	nomeNovo = nome;
        	idadeNovo = idade;
        }
        
        System.out.println("Digite o nome do 5° usuário:");
        nome = in.next();
        System.out.println("Digite a idade do 5° usuário:");
        idade = in.nextInt();
        
        if (idade > idadeVelho) {
        	nomeVelho = nome;
        	idadeVelho = idade;
        } else if (idade < idadeNovo) {
        	nomeNovo = nome;
        	idadeNovo = idade;
        }
        
        System.out.println("O nome do usuário mais velho é " + nomeVelho + ". E a idade é " + idadeVelho);
        System.out.println("O nome do usuário mais velho é " + nomeNovo + ". E a idade é " + idadeNovo);
        
        in.close();
	}
}
