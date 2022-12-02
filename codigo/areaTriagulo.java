package codigo;

import java.util.Scanner;

public class areaTriagulo {
	public static void main(String[] args) {
		
		double base, altura, area;
		
		Scanner in = new Scanner(System.in);
		System.out.println("colque a base do triângulo:");
		base = in.nextDouble();
		System.out.println("coloque a altura do triângulo:");
		altura = in.nextDouble();
		area = base * altura / 2;
		System.out.println("A area é: " + area);
		in.close();
	}
}