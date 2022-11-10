package SeSenao;

import java.util.Scanner;

public class idade {
	
	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int dtNasc, anoAtual, idade = 0;

        System.out.println("Digite seu ano de nascimento:");
        dtNasc = in.nextInt();
        System.out.println("Digite o ano atual:");
        anoAtual = in.nextInt();

        idade = anoAtual - dtNasc;

        System.out.println("Idade" + idade);
        
        if (idade < 10) {
            System.out.println("Criança");
        } else if (idade >= 10) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
        in.close();
    }

}
