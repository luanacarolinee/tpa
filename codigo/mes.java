package codigo;

import java.util.Scanner;

public class mes {
	public static void main(String[] args) {
		
		int dias, meses, anos;
		
		Scanner in = new Scanner(System.in);
		System.out.println("coloque a quantidade de dias a serem convertidas:");
		dias = in.nextInt();
		meses = dias / 30;
		anos = dias / 365;
		System.out.println(dias + " equivalem a " + anos + " anos, ou " + meses + " meses.");
		in.close();
	}
}