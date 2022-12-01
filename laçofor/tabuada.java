
package laçofor;
import java.util.Scanner;

public class tabuada {
	
	public class Tabuada {
		public static void main(String[]args) {
			Scanner in = new Scanner (System.in);
			int i, n, res;
			for(i=1;i<=10;i++) {
				System.out.println("Digite um número inteiro: ");
				n = in.nextInt();
				res = n*i;
				System.out.println(n+"x"+i+"="+res);
			}
			in.close();
		}
	}
}
