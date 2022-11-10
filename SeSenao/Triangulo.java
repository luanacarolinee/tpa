package SeSenao;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double x, y, z;
        
        System.out.println("Digite o tamanho do primeiro lado:");
        x = in.nextDouble();
        System.out.println("Digite o tamanho do segundo lado:");
        y = in.nextDouble();
        System.out.println("Digite o tamanho do terceiro lado:");
        z = in.nextDouble();
        

        
        if (x < (y + z) | y < (x + z) | z < (x + y)) {
            
            if (x == y && y == z) {
                System.out.println(" triângulo Equilátero.");
            } else if (x != y && y != z && z != x) {
                System.out.println("E triângulo Escaleno.");
            } else {
                System.out.println("triângulo Isósceles.");
            }

        } else {
            System.out.println(" não são capazes de formar um triângulo.");
        }
        in.close();
	}
}
