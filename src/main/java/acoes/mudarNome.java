package acoes;

import java.util.Scanner;

public class mudarNome {
	
	public static String mudaNome() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome guerreiro(a)?\nMeu nome é: ");
        String nome = scanner.nextLine();
        return nome;
	}

}
