package lista_3;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_seis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Números no intervalo entre " + a + " e " + b + ":");
        for (int i = a + 1; i < b; i++) {
            System.out.println(i);
		
		
sc.close();

	}

}
}

