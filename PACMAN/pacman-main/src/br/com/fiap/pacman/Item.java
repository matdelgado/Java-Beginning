package br.com.fiap.pacman;

public class Item extends GameObject{
	
	private boolean visivel;

	public Item() {
		super();
		
	}

	public Item(int posicaoX, int posicaoY) {
		super(posicaoX, posicaoY);
		this.visivel = visivel;
	}

	public boolean isVisivel() {
		return visivel;
	}

	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}
	
	
	
}
