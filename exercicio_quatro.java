package lista_3;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_quatro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 5 números : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		
		double soma = a + b + c + d + e;
		System.out.println("Soma : " + soma);
		
		double media = soma / 5;
		System.out.println("Media : " + media);
		
		System.out.println("----FIM----");
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
