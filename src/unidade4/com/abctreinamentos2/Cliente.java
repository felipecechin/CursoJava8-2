package unidade4.com.abctreinamentos2;



public class Cliente {
	String cpf;
	String nome;
	String email;
	
	public Cliente(String cpf, String nome, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
	
}
