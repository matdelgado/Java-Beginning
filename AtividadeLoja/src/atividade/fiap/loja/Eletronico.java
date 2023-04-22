package atividade.fiap.loja;

public class Eletronico extends Loja {
		
	private String marca;
	private String modelo;
	private String meuTipo = "Eletrônico";
		
	public Eletronico(String produto, Double preco, int quantidade, String marca, String modelo) {
		super(produto, preco, quantidade);
		setTipo(meuTipo);
		this.marca = marca;
		this.modelo = modelo;
	}
	
	@Override
	public String toString () {
		return super.toString() + " - " + this.marca + this.modelo;
	}
	
	@Override
	public double getPrecoMinimo() {
		if(marca.equalsIgnoreCase("Apple")) 
			return super.getPrecoMinimo();
		return super.getPrecoMinimo() * 0.9;
	}
	
}

	

