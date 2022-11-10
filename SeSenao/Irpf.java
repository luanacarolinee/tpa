package SeSenao;

import java.util.Scanner;

public class Irpf {
	
	 static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double salario, desconto = 0;
        
        System.out.println("Digite o seu salário:");
        salario = in.nextDouble();
        
        if (salario <= 1434.59) {
            System.out.println("Desconto do IRPF isento.");
        } else if (salario > 1434.59 && salario <= 2150) {
            desconto = salario * 7.5 / 100;
            System.out.println("O desconto foi de 7,5% Totalizando R$ " + desconto);
        } else if (salario > 2150 && salario <= 2866.70) {
            desconto = salario * 15 / 100;
            System.out.println("O desconto foi de 15% Totalizando R$ " + desconto);
        } else if (salario > 2866.70 && salario <= 3582) {
            desconto = salario * 22.5 / 100;
            System.out.println("O desconto foi de 22,5% Totalizando R$ " + desconto);
        } else if (salario > 3582) {
            desconto = salario * 27.5 / 100;
            System.out.println("O desconto foi de 27,5% Totalizando R$ " + desconto);
        }
        in.close();
	}

}
