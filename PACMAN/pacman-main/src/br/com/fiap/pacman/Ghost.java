package br.com.fiap.pacman;


public class Ghost extends GameObject {
	
	private int direcao;

	public Ghost() {
		super();
	}

	public Ghost(int posicaoX, int posicaoY, int direcao) {
		super(posicaoX, posicaoY);
		this.direcao = direcao;
	}
	
	public void mover() {
		
		int A = (int) (Math.random() * 4);
		
		if ((A) == 0 && (getPosicaoY() - 10) > getScreeSize()) {
			setPosicaoY(getPosicaoY() - 10);
		}
		else if ((A) == 1 && (getScreeSize() < (getPosicaoX() + 10) )) {
			setPosicaoX(getPosicaoX() + 10);
		}
		else if ((A) == 2 && (getScreeSize() < (getPosicaoY() + 10) )) {
			setPosicaoX(getPosicaoY() + 10);
		}
		else if ((A) == 3 && (getScreeSize() < (getPosicaoX() - 10) )) {
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
	
	
	
	
}
