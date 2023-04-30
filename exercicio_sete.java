package lista_3;

import java.util.Scanner;

public class exercicio_sete {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int Pares = 0;
	int Impares = 0;
	
	System.out.println("Digite 10 números inteiros : ");
	for (int i = 1; i <= 10; i++) {
		
	    System.out.print("Número " + i + ": ");
	    int numero = sc.nextInt();
        if (numero % 2 == 0) {
        	 Pares++;
	            } else {
	                Impares++;
	            }
	        }

	 System.out.println("Quantidade de números pares: " + Pares);
	 System.out.println("Quantidade de números ímpares: " + Impares);
sc.close();

	}

}
