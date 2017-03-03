package unidade4.com.abctreinamentos2;

import java.nio.file.Path;

public class Curso {
	String nome;
	int cdcurso;
	float valor;
	Path url;
	
	public Curso(String nome, int cdcurso, float valor, Path url) {
		super();
		this.nome = nome;
		this.cdcurso = cdcurso;
		this.valor = valor;
		this.url = url;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + "]";
	}
	
	
}
