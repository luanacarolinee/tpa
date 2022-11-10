package SeSenao;

import java.util.Scanner;

public class Autonomia {
	
	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double km, l, autonomia;
		
		System.out.println("Digite a distância percorrida em quilômetros:");
		km = in.nextDouble();
		System.out.println("Digite a capacidade do tanque de combustível em litros:");
		l = in.nextDouble();
		
		autonomia = km / l;

		if (autonomia >= 10) {
			System.out.println("Veículo Econômico:");
		} else {
			System.out.println("Veículo não Econômico:");
		}
		in.close();
    }

}
