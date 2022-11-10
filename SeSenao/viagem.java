package SeSenao;

import java.util.Scanner;

public class viagem {
	
	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int ilha, dias = 0;
        double valor = 0;
        
        System.out.println("Digite 1 para Ilhabela. \nDigite 2 para Fernando de Noronha");
        ilha = in.nextInt();

        
        if (ilha >= 1 && ilha <= 2) {
        
            System.out.println("Digite a quantidade de dias de viagem:");
            dias = in.nextInt();
            
	        if (ilha == 1) {
	        	System.out.println("Ilha Escolhida: Ilhabela");
	        	if (dias >= 2 && dias <= 5) {
	        		valor = 240 * dias;
	        	} else if (dias >= 6 && dias <= 10) {
	        		valor = (220 * dias) + 130;
	        	} else {
	        		valor = (210 * dias) + 150;
	        	}
	        } else if (ilha == 2) {
	        	System.out.println("Ilha Escolhida: Fernando de Noronha");       	
	        	if (dias >= 2 && dias <= 5) {
	        		valor = (400 * dias) + 100;
	        	} else if (dias >= 6 && dias <= 10) {
	        		valor = (410 * dias) + 150;
	        	} else {
	        		valor = (420 * dias) + 200;
	        	}
	            System.out.println("Quantidade de Dias: " + dias);
	            System.out.println("Valor Total da Viagem: R$ " + valor);
	        }
        } else {
        	System.out.println("Ilha selecionada inválida");
        }
        in.close();	
	}

}
