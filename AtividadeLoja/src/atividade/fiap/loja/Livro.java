package atividade.fiap.loja;

public class Livro extends Loja{
	
	private String autor;
	
	public Livro(String produto, Double preco, String tipo, int quantidade, String autor) {
		super(produto, preco, tipo, quantidade);
		this.autor = autor;
	}
	
	public String dadosProduto() {
		return tipoProduto() + " " + precoProduto() + " " + produtoProduto() + " " + quantidadeProduto() + " " + autorLivro();
		
	}

	public String autorLivro() {
		return this.autor;
	}
	
}
