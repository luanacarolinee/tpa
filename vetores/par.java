package vetores;

	import java.util.Scanner;

	  public class par {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int n = 10, a[], i, qtdPares = 0;
			
			a = new int[n];
			
			for (i = 0; i < n; i++) {
				System.out.printf("Digite o valor do vetor A: ", (i + 1));
				a[i] = in.nextInt();
			}

			System.out.print("\nVetor A: ");
			for (i = 0; i < n; i++) {
				if (i == 0) {
					System.out.print("[" + a[i] + " ");
				} else if (i == n - 1) {
					System.out.print(a[i] + "]\n");
				} else {
					System.out.print(a[i] + " ");
				}
			}
		
			for (i = 0; i < n; i++) {
				if (a[i] % 2 == 0) {
					System.out.print(a[i] + " ");
					qtdPares += 1;
					System.out.print("Números pares dentro do Vetor A: ");
				}
			}
			
			System.out.printf("Quantidade total de números pares dentro do vetor A: %d", qtdPares);
			in.close();
		}
	}

