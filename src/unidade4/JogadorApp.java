package unidade4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JogadorApp {
	public static void main(String[] args) {
		Jogador jog1 = new Jogador("Neymar", 86, "Barça", "Espanha");
		Jogador jog2 = new Jogador("Messi", 91, "Barça", "Espanha");
		Jogador jog3 = new Jogador("CR7", 94, "RM", "Espanha");
		Jogador jog4 = new Jogador("Rafinha", 79, "Barça", "Espanha");
		Jogador jog5 = new Jogador("Rakitic", 76, "Barça", "Espanha");
		Jogador jog6 = new Jogador("Pique", 77, "Barça", "Espanha");
		
		List<Jogador> lista = new ArrayList<>();
		lista.add(jog1);
		lista.add(jog2);
		lista.add(jog3);
		lista.add(jog4);
		lista.add(jog5);
		lista.add(jog6);
		
		Collections.sort(lista);
		
		int i=0;
		for (Jogador jog:lista) {
			if (i==5) {
				break;
			}
			System.out.println(jog);
			i++;
		}
		
	}

}
