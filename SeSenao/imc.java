package SeSenao;

import java.util.Scanner;

public class imc {
	
	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double peso, altura, imc = 0;
        
        System.out.println("Digite seu peso:");
		peso = in.nextDouble();
		System.out.println("Digite sua altura:");
		altura = in.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("IMC: " + imc);
		
		if (imc < 18.5) {
			System.out.println("Excesso de Magreza");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso Normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Excesso de Peso");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("Obesidade Grau I");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Obesidade Grau II");
		} else if (imc >= 40) {
			System.out.println("Obesidade Grau III");
		}
		in.close();
	}


}
