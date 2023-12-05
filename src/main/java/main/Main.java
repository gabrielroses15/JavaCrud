package main;

import acoes.EnumAcoes;
import acoes.mudarNome;
import historiasQuests.StartHist;
import menus.MenuPrincipal;

public class Main {
	private static String nome;
	public static void main(String[] args) {
		nome = mudarNome.mudaNome();
		while (true) {
			StartHist.start();
			
			System.out.println(String.format("Seja bem vindo %s!", getNome()));
			
			int escolha = MenuPrincipal.menuEscolhas();
			EnumAcoes.listaAcoes(escolha);
		}
       
    }
	
	public static String getNome() {
		return nome;
	}
	
	public static void setNome(String nomeInformado) {
		nome = nomeInformado;
	}

}
