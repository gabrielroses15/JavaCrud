package acoes;

import heros.HerosList;
import heros.HerosModel;
import main.Main;

public class EnumAcoes {
	public static void listaAcoes(int acaoNumber) {
		switch(acaoNumber) {
		case 1:
			String novoNome = mudarNome.mudaNome();
			Main.setNome(novoNome);
			break;
		case 2:
			HerosModel heroi = new HerosModel();
			HerosList.addHero(heroi);
			break;
		case 3:
			HerosList.showHerosList();
			break;
		case 4:
			HerosList.removeHero();
			break;
		case 5:
			HerosList.editarHeroi();
			break;
		default:
			break;
		}
	}
}
