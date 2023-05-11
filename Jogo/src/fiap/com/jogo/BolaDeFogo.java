package fiap.com.jogo;

public class BolaDeFogo implements Intermediaria{
	
	private int x;
	private int y;
	private int poder;

	public BolaDeFogo(int poder) {
		super();
		this.poder = poder;
	}

	@Override
	public void mover(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}
	
	
	
	
}
