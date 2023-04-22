package atividade.fiap.loja;

public class Livro extends Loja{
	
	private String autor;
	private String meuTipo = "Livro";
	
	public Livro(String produto, double preco, int quantidade, String autor) {
		super(produto, preco, quantidade);
		setTipo(autor);
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + this.autor;
	}
	
	@Override
	public double getPrecoMinimo() {
		return super.getPrecoMinimo() * 0.8;
	}
	
}
