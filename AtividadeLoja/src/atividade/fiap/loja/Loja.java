package atividade.fiap.loja;

public class Loja extends Object {

	private String produto;
	private Double preco;
	private String tipo;
	private int quantidade;
	
	public Loja(String produto, Double preco, String tipo, int quantidade) {
		this.produto = produto;
		this.preco = preco;
		this.tipo = tipo;
		this.quantidade = quantidade;
	}
	
	public String tipoProduto() {
		return this.tipo;
	}
	
	public Double precoProduto() {
		return this.preco;
	}
	
	public String produtoProduto() {
		return this.produto;
	}
	
	public int quantidadeProduto() {
		return this.quantidade;
	}
	
	public boolean nivelEstoque() {
		if (this.quantidade <= 5) {
			return true;
		}
		return false;
	}
	
}
