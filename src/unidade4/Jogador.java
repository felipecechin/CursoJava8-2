package unidade4;

public class Jogador implements Comparable<Jogador>{
	private String nome;
	private int pontuacao;
	private String clube;
	private String pais;
	
	@Override
	public int compareTo(Jogador jogador2) {
		if (this.pontuacao < jogador2.pontuacao) {
			return 1;
		} else if (this.pontuacao > jogador2.pontuacao) {
			return -1;
		} else 
		return 0;
	}

	@Override
	public String toString() {
		return nome + ";pontuação:"+pontuacao;
	}

	public Jogador(String nome, int pontuacao, String clube, String pais) {
		super();
		this.nome = nome;
		this.pontuacao = pontuacao;
		this.clube = clube;
		this.pais = pais;
	}
	
	
}
