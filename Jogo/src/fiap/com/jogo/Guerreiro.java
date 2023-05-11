package fiap.com.jogo;

public class Guerreiro extends Jogador implements Intermediaria {

	public Guerreiro() {
		super();
	}

	public Guerreiro(String nome) {
		super(nome);
	}
	
	@Override
	public void mover(int x, int y) {
		setX(x);
		setY(y);
	}
	
	

}
