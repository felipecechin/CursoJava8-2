package unidade4;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {
	public static void main(String[] args) {
		Deque<String> lista = new ArrayDeque<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		lista.removeFirst();
		lista.removeLast();
		System.out.println(lista);
		lista.addFirst("azul");
		lista.addLast("preto");
		System.out.println(lista.peekFirst());
		System.out.println(lista.peekLast());
	}
}
