package vetores;

import java.util.Scanner;
	public class raiz {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			double b[];
			int n = 10, a[], i;
			
			a = new int [n];
			b = new double [n];
			
			for (i = 0; i < n; i++) {
				System.out.printf("valor da posição do vetor A: ", (i + 1));
				a[i] = in.nextInt();
				b[i] = Math.sqrt(a[i]);
			}
			
			System.out.print("\nVetor A: ");
			for (i = 0; i < n; i++) {
				if (i == 0) {
					System.out.print("[" + a[i] + " ");
				} else if (i == n - 1) {
					System.out.print(a[i] + "]");
				} else {
					System.out.print(a[i] + " ");
				}
			}
			
			System.out.print("\nVetor B: ");
			for (i = 0; i < n; i++) {
				if (i == 0) {
					System.out.printf("[" + b[i] + " ");
				} else if (i == n - 1) {
					System.out.print(b[i] + "]");
				} else {
					System.out.print(b[i] + " ");
				}
			}
			in.close();
		}
	}

