package atividade.fiap.loja;

public class Vestuario extends Loja{
	
	private String cor;
	private String tamanho;
	private String meuTipo = "Vestuario";
	
	public Vestuario(String produto, Double preco, int quantidade, String autor, String cor, String tamanho) {
		super(produto, preco, quantidade);
		setTipo(meuTipo);
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
		
	@Override
	public String toString() {
		return super.toString() + " - " + this.cor + this.tamanho;
	}
	
	@Override
	public double getPrecoMinimo() {
		if ((nivelEstoque())) {
			return super.getPrecoMinimo()*0.7;		
	}
		return super.getPrecoMinimo();
}

}
