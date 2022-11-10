package SeSenao;

import java.util.Scanner;

public class Crescente {
	
	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double a, b, c;
        
        System.out.println("Digite um número:");
        a = in.nextDouble();
        System.out.println("Digite outro número:");
        b = in.nextDouble();
        System.out.println("Digite mais um número:");
        c = in.nextInt();
        
        System.out.println("Ordem Crescente:");
        
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        
        if (a > b && a < c || a > c && a < b) {
            System.out.println(a);
        } else if (b > a && a < c || b > c && b < a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        in.close();
	}


}
