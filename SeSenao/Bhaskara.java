package SeSenao;

import java.util.Scanner;

public class Bhaskara {
	
	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double a, b, c, delta, x1, x2;
        
        System.out.println("Digite o valor de A:");
        a = in.nextInt();
        System.out.println("Digite o valor de B:");
        b = in.nextInt();
        System.out.println("Digite o valor de C:");
        c = in.nextInt();
        
        delta = (b*b) - 4 * a * c;
		
        if (delta < 0) {
            System.out.println("Não existem raízes reais para a equação.");
        } else if (delta == 0) {
        	x1 = (-b) / (2 * a);
            System.out.println("Existe apenas uma raiz real Sendo ela: " + x1);
        } else if (delta > 0) {
        	x1 = -b + Math.sqrt(delta) / (2 * a);
        	x2 = -b - Math.sqrt(delta) / (2 * a);
            System.out.println("Existem duas raízes real  Sendo elas: " + x1 + " e " + x2);
        }
        in.close();
	}

}
