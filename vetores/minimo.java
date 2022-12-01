package vetores;
	
	import java.util.Scanner;

	public class  minimo{
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int n = 10, a[], i, maior = 0, menor = 0;
			
			a = new int[n];
			
			for (i = 0; i < n; i++) {
				System.out.printf("Informe o valor da %d° posição do vetor A: ", (i + 1));
				a[i] = in.nextInt();
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
			
			for (i = 0; i < n; i++) {
				if (i == 0) {
					maior = menor = a[i];
				} else {
					if (a[i] < menor) {
						menor = a[i];
					} else if (a[i] > maior) {
						maior = a[i];
					}
				}
			}
			System.out.println("\nMaior valor dentro do vetor A: " + maior);
			System.out.println("Menor valor dentro do vetor A: " + menor);
			in.close();
		}
	}
