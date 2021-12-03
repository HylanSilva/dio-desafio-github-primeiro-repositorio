
import java.util.Scanner;

public class helloWord {
	public static void main(String[] args) {
		System.out.println("Olá Mundo!");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int N1 = sc.nextInt();
		System.out.print("Digite outro núemro: ");
		int N2 = sc.nextInt();
		
		int soma = N1+N2;
		int sub = N1-N2;
		int mult = N1*N2;
		
		System.out.println(" O valor da soma dos dois numeros é igual á: "+soma);
		System.out.println(" O valor da subtração dos dois numeros é igual á: "+sub);
		System.out.println(" O valor da multiplicação dos dois numeros é igual á: "+mult);
		
		sc.close();
	}
}
