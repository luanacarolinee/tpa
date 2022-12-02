package classicaslaço;

public class primo {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int n;
		System.out.println(" um número inteiro: ");
		n=in.nextInt();
		if (n==2){
			System.out.println(n+" é um número primo");
		}
		else if(n%2!=1){
			System.out.println(n+" não é um número primo");
		}else{
			System.out.println(n+" é um número primo");
		}
	}
}
