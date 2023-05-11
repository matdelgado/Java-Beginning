package fiap.com.jogo;

public class Mago extends Jogador implements Intermediaria{

	private int mp;

	public Mago() {
		super();
	}

	public Mago(String nome) {
		super(nome);
	}
	
	@Override
	public void mover(int x, int y) {
		setX(x);
		setY(y);
		
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	
	
	
}
