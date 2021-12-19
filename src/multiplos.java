import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite n");
		int n = sc.nextInt();
		System.out.println("Primeiro número digitado :" + n);
		System.out.println("Digite m");
		int m = sc.nextInt();
		System.out.println("Segundo número digitado :" + m);
		
		for(int i = 1;i < n;i++) {
			
			int x = m*i;
	
		System.out.println("Multiplos  : " + x);	
		
		
		sc.close();
	}

}
	
}