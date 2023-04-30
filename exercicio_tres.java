package lista_3;

import java.util.Scanner;

public class exercicio_tres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;
		
		System.out.println("Digite um nome (com mais de 3 caracteres) : ");
		nome = sc.next();
		
		while (nome.length() <= 3) {
			System.out.println("Por favor digite um nome valido:");
			nome = sc.next();
			}
		System.out.println("Por favor digite sua idade : ");
		idade = sc.nextInt();
		
		while (idade < 0 || idade > 150) {
			System.out.println("Digite uma idade correta : ");
			idade = sc.nextInt();
			}
		System.out.println("Por favor iforme seu salario : ");
		salario = sc.nextDouble();
		
		while (salario < 0) {
			System.out.println("Por favor informe seu salario corretamente : ");
			salario = sc.nextDouble();
			}
		System.out.println("Por favor digite seu sexo : ");
		sexo = sc.next().charAt(0);
		
		while (sexo != 'f' && sexo != 'm') {
			System.out.println("Por favor digite seu sexo corretamente : ");
		    sexo = sc.next().charAt(0);
		}
		System.out.println("Por favor informe seu estado civil : ");
		estadoCivil = sc.next().charAt(0);
		
		while (estadoCivil != 'c' && estadoCivil != 's' && estadoCivil != 'v' && estadoCivil != 'd') {
			System.out.println("Por favor digite o estado civil corretamente : ");
			estadoCivil = sc.next().charAt(0);
			
		}
		System.out.println("-----FIM-----");
		
		
		
		
		
        
		sc.close();
		
	}

	}


