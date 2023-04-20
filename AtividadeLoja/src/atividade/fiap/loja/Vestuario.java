package atividade.fiap.loja;

public class Vestuario extends Loja{
	
	private String cor;
	private String tamanho;
	
	public Vestuario(String produto, Double preco, String tipo, int quantidade, String autor) {
		super(produto, preco, tipo, quantidade);
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	public String corVestuario() {
		return this.cor;
	}
	
	public String tamanhoVestuario() {
		return this.tamanho;
	}
		
	public String dadosProduto() {
		return tipoProduto() + " " + precoProduto() + " " + produtoProduto() + " " + quantidadeProduto() + " " + corVestuario() + " " + tamanhoVestuario();
		
	}
	
	public double descontoVestuario() {
		if (nivelEstoque()) {
			return (precoProduto() - (precoProduto() * 0.20));
	}
		return 0;
	
}

}
