
import java.util.Scanner;

public class helloWord {
	public static void main(String[] args) {
		System.out.println("Ol� Mundo!");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int N1 = sc.nextInt();
		System.out.print("Digite outro n�emro: ");
		int N2 = sc.nextInt();
		
		int soma = N1+N2;
		int sub = N1-N2;
		int mult = N1*N2;
		
		System.out.println(" O valor da soma dos dois numeros � igual �: "+soma);
		System.out.println(" O valor da subtra��o dos dois numeros � igual �: "+sub);
		System.out.println(" O valor da multiplica��o dos dois numeros � igual �: "+mult);
		
		sc.close();
	}
}
