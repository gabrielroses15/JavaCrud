package menus;

import java.util.Scanner;

public class MenuPrincipal {
    public static int menuEscolhas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- Alterar nome\n2- Criar um herói\n3- Listar heróis já criados\n4- Apagar um herói\n5- Editar um herói");
        int escolha = scanner.nextInt();
        scanner.nextLine();
        return escolha;
    }
}
