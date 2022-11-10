package SeSenao;

import java.util.Scanner;

public class MediaNota {
	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double nota1, nota2, notaExame, media;
        
        System.out.println("Digite a 1° Nota:");
        nota1 = in.nextDouble();
        System.out.println("Digite a 2° Nota:");
        nota2 = in.nextDouble();
		
        media = (nota1 + nota2) / 2;
        
        if (media < 3) {
        	System.out.println("Reprovado");
        } else if (media >= 6) {
        	System.out.println("Aprovado");
        } else if (media >= 3 && media < 6) {
        	System.out.println("EM EXAME");
        	
        	System.out.println(" insira uma nota de Exame:");
        	notaExame = in.nextDouble();
        	
        	media = (notaExame + media) / 2;
        	
        	if (media >= 6) {
            	System.out.println("Aprovado");
        	} else {
            	System.out.println("Reprovado");
        	}
        }
        in.close();
	}

}
