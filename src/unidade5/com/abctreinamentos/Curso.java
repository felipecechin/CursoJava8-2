package unidade5.com.abctreinamentos;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCdcurso() {
		return cdcurso;
	}

	public void setCdcurso(int cdcurso) {
		this.cdcurso = cdcurso;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Path getUrl() {
		return url;
	}

	public void setUrl(Path url) {
		this.url = url;
	}
	
	
}
