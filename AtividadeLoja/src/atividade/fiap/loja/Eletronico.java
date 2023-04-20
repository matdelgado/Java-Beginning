package atividade.fiap.loja;

public class Eletronico extends Loja {
		
	private String marca;
	private String modelo;
		
	public Eletronico(String produto, Double preco, String tipo, int quantidade, String marca, String modelo) {
		super(produto, preco, tipo, quantidade);
		this.marca = marca;
		this.modelo = modelo;
	}
		
	public String dadosProduto() {
		return tipoProduto() + " " + precoProduto() + " " + produtoProduto() + " " + quantidadeProduto() + " " + marcaEletronico() + " " + modeloEletronico();
			
	}
	
	public String marcaEletronico() {
		return this.marca;
	}
	
	public String modeloEletronico() {
		return this.modelo;
	}

}

	

