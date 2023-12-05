package heros;

import java.util.Scanner;

public class HerosModel {
    private String nome;
    private int idade;
    private int lvl;
    private String classe;
    private static int nextId = 1;
    private int id;

    public HerosModel() {
        nome = nomeDoHeroi();
        idade = idadeDoHeroi();
        lvl = lvlDoHeroi();
        classe = classeDoHeroi();
        id = nextId;
        nextId++;
    }

    private String nomeDoHeroi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual será o nome do herói?\n");
        String nome = scanner.nextLine();
        return nome;
    }

    private int idadeDoHeroi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual será a idade do herói?\n");
        int idade = scanner.nextInt();
        return idade;
    }

    private int lvlDoHeroi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual será o nível do herói? (0-100)\n");
        int lvl = scanner.nextInt();
        return lvl;
    }

    private String classeDoHeroi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual será a classe do herói?\n");
        String classe = scanner.nextLine();
        return classe;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getLvl() {
        return lvl;
    }

    public String getClasse() {
        return classe;
    }

    public int getId() {
        return id;
    }
    
    public void setNome() {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Qual será o nome dele?\n");
        this.nome = scanner.nextLine();
    }
    
    public void setIdade() {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Qual será o nome dele?\n");
        this.idade = scanner.nextInt();
    }
    
    public void setClasse() {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Qual será o nome dele?\n");
        this.classe = scanner.nextLine();
    }
    
    public void setLvl() {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Qual será o nome dele?\n");
        this.lvl = scanner.nextInt();
    }
}
