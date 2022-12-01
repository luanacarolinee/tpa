package vetores;

import java.util.Scanner;

public class inverso {
	
	   public static void main(String[] args) {
		   
			Scanner in = new Scanner (System.in);
			
			final int TAM = 10;
			
			int a[], b[], i, ir=9;
			
			a = new int[TAM];
			b = new int[TAM];

			for(i=0; i<TAM ; i++) {
				System.out.println("coloque um número inteiro: ");
				a[i]=in.nextInt();
				
				b[ir]=a[i];
				ir--;
			}
			
			
			System.out.println("Números inverso ");
			for(i=0; i<10; i++) {
				System.out.print("-"+b[i]+" ");
			}
		}
	}
