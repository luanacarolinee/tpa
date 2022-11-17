package enquanto;
import java.util.Scanner;

public class fatorial {
	
	public class Fatorial {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
		
			int fatorial = 1, i;
			
			System.out.println("Informe o número:");
			i = in.nextInt();
			
			System.out.print(i + "! = ");
			
			while (i > 1) {
				fatorial = fatorial * i;
				System.out.print(i + " x ");
				i--;
			}
			
			System.out.print(i + " = " + fatorial);
			in.close();
		}
}


}
