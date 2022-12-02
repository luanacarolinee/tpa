package classicaslaço;

public class tabuada {
	public static void main (String args[]) {
		int a, i, res;
		for (a=1; a<=10; a++) {
			for (i=1; i<=10; i++) {
				res=a*i;
				System.out.println(a+" x "+i+" = "+res);
			}
		}
	}
}
