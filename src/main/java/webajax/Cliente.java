package webajax;

public class Cliente {
	
	private String nome;
	private String email;
	
	public Cliente(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", email=" + email + "]";
	}
	
	
	
	

}