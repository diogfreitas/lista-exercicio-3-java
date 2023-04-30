package lista_3;

import java.util.Scanner;

public class exercicio_dois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Por favor digite seu nome :");
		String nome = sc.next();
		
		System.out.println("Por favor digite sua senha :");
		String senha = sc.next();
		
		while(nome.equals(senha)) {
			System.out.println("Sua senha nao pode ser igual ao nome, digite outra senha :");
			senha = sc.next();
			}
		
		System.out.println("O usuario " + nome + " foi cadastrado com sucesso!!");
		
		
		
		sc.close();
	}

}
