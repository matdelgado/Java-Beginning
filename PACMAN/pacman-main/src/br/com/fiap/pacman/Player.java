package br.com.fiap.pacman;

public class Player extends GameObject {

	private int direcao;
	private int vida;
	private boolean invencivel;
	
	public Player() {
		super();
	}

	public Player(int posicaoX, int posicaoY, int direcao) {
		super(posicaoX, posicaoY);
		this.direcao = direcao;
		this.vida = 3;
		this.invencivel = false;
		
	}
	
	public void mover() {
		if (direcao == 0 && (getScreeSize() < (getPosicaoY() - 10) )) {
			setPosicaoY(getPosicaoY() - 10);
		}
		else if (direcao == 90 && (getScreeSize() < (getPosicaoX() + 10) )) {
			setPosicaoX(getPosicaoX() + 10);
		}
		else if (direcao == 180 && (getScreeSize() < (getPosicaoY() + 10) )) {
			setPosicaoX(getPosicaoY() + 10);
		}
		else if (direcao == 270 && (getScreeSize() < (getPosicaoX() - 10) )) {
			setPosicaoX(getPosicaoY() - 10);
		}
		
	}
	
	public int getDirecao() {
		return direcao;
	}

	public void setDirecao(int direcao) {
		if (direcao == 0 || direcao == 90 || direcao == 180 || direcao == 270) {
			this.direcao = direcao; }
	}

	public int getLife() {
		return vida;
	}

	public void setLife(int vidas) {
		this.vida = vidas;
	}

	public boolean isInvencivel() {
		return invencivel;
	}

	public void setInvencivel(boolean invencivel) {
		this.invencivel = invencivel;
	}


	
	
}
