package webajax;

public class Cliente {
	
	private String nome;
	private String login;
	private String senha;
	private String estado;
	
	public Cliente(String nome, String login, String senha, String estado) {
		super();
		this.nome = nome;
		this.login= login;
		this.senha= senha;
		this.estado = estado;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login= login;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", login=" + login+ " , senha="+senha+" , estado= "+estado+"]";
	}
	
	
	
	

}
