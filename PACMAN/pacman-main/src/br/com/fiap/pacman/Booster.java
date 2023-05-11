package br.com.fiap.pacman;

public class Booster extends Item{
	
	private int duracao;

	public Booster() {
		super();
		
	}

	public Booster(int posicaoX, int posicaoY) {
		super(posicaoX, posicaoY);
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
	
}
