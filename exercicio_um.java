package lista_3;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_um {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite uma nota de 0 a 10 :");
		int nota = sc.nextInt();
		
		while (nota < 0 || nota > 10) {
		System.out.println("Por favor digite uma nota valida :");
		
		nota = sc.nextInt();
		
	
		}
		
		System.out.println("Sua nota é : "+ nota);
		
		sc.close();
		
			
	}
}


