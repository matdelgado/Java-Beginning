package atividade.fiap.loja;

public class Loja extends Object {

	private String produto;
	private Double preco;
	private String tipo;
	private int quantidade;
	
	public Loja(String produto, Double preco, int quantidade) {
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		String dados = String.format("[tipo], %s (%d): %.2f ", 
				produto,
				quantidade,
				preco
				);
		
			if (nivelEstoque()) {
				dados = "!ESTOQUE BAIXO " + dados;				 
		}
			return dados;
	}
	
	public double getPrecoMinimo() {
		return preco;
	}
	
	public boolean nivelEstoque() {
		if (this.quantidade <= 5) {
			return true;
		}
		return false; 
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}

