package heros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HerosList {
	private static List<HerosModel> listaDeHerois = new ArrayList<>();
	public static void showHerosList() {
		for (HerosModel heroi : listaDeHerois) {
            System.out.println("Nome: " + heroi.getNome());
            System.out.println("Idade: " + heroi.getIdade());
            System.out.println("Nível: " + heroi.getLvl());
            System.out.println("Classe: " + heroi.getClasse());
            System.out.println("ID: " + heroi.getId());
            System.out.println("------");
        }
	}
	public static void addHero(HerosModel heroi) {
		listaDeHerois.add(heroi);
	}
	public static void removeHero() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual é o ID do herói?\n");
		int id = scanner.nextInt();
		listaDeHerois.remove(id-1);
	}
	public static void editarHeroi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o ID do herói?\n");
        int id = scanner.nextInt();
        if (simOuNao("Gostaria de alterar o nome dele(a)?")) {
            HerosList.listaDeHerois.get(id-1).setNome();
        }
        if (simOuNao("Gostaria de alterar a idade dele(a)?")) {
            HerosList.listaDeHerois.get(id-1).setIdade();
        }
        if (simOuNao("Gostaria de alterar a classe dele(a)?")) {
            HerosList.listaDeHerois.get(id-1).setClasse();
        }
        if (simOuNao("Gostaria de alterar o lvl dele(a)?")) {
            HerosList.listaDeHerois.get(id-1).setLvl();
        }
    }
	public static boolean simOuNao(String frase) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(frase + " (s/n)\n");
		if (scanner.nextLine().equals("s")) {
			return true;
		}
		return false;
	}
}
