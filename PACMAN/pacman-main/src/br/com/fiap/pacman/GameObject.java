package br.com.fiap.pacman;

public class GameObject {
	private int posicaoX;
	private int posicaoY;
	private int screeSize = 200;
	
	public GameObject() {
	}
	
	public GameObject(int posicaoX, int posicaoY) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public int getScreeSize() {
		return screeSize;
	}

	public void setScreenSize(int screeSize) {
		this.screeSize = screeSize;
	}
	
	
}
