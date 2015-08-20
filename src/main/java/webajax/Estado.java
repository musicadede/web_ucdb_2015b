package webajax;

/**
 * Created by Virmerson Bento dos Santos on 12/08/15.
 */
public class Estado {
    private String uf;
    private String nome;

    public Estado(String uf, String nome) {
        this.uf=uf;
        this.nome=nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	@Override
	public String toString() {
//		System.out.println("A");
		return "[uf=" + uf+ ", nome=" + nome+"]";
}


}
