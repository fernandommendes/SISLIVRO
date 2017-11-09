package dados;

public class Livro {
private static int seq = 0;
	
	private int codigo;
	private String titulo;
	private String autor;
	private int numeracao;

	public Livro (int codigo, String titulo, String autor, int numeracao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		numeracao = ++seq;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public static int getSeq() {
		return seq;
	}

	public static void setSeq(int seq) {
		Livro.seq = seq;
	}

	public int getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}
	
	public String toString(){
		return
				"Código: " + codigo + "\n" +
				"Titulo: " + titulo + "\n" +
				"Autor:" + autor + "\n"; 
	}
	
	
}
