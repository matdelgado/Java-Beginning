
public class Formiga {

	int velocidade = 5;
	int localidadeX;
	int localidadeY;
	boolean carrega = false;
	int feromonio;
	int posicaoCasaX = 5;
	int posicaoCasaY = 10;
	int posicaoComidaX = 5;
	int posicaoComidaY = 9;
	int posicaoFormigaX;
	int posicaoFormigaY;
	
	public Formiga() {
		
	}
	
	public void Formiga(int localidadeY, int localidadeX) {
		this.posicaoFormigaX = localidadeX;
		this.posicaoFormigaY = localidadeY;
	}
	
	public boolean procuraComida() {
		if (posicaoComidaX == this.localidadeX && posicaoComidaY == this.localidadeY)  {
			return true;
			}
		else {
			return false;
		}
	}
	
	public void pegaComida() {
		if (procuraComida() == true) {
			this.carrega = true;
		}
		else {
			this.carrega = false;
		}
	}
	
	public void largaComida() {
		this.carrega = false;
	}
	
	public void andaDirecao(int localidadeX, int localidadeY) {
		this.posicaoFormigaX = localidadeX;
		this.posicaoFormigaY = localidadeY;	
	}
	
	public boolean isHome() {
		if (this.posicaoFormigaX == this.posicaoCasaX && this.posicaoFormigaY == this.posicaoCasaY) {
			this.carrega = false;
			this.posicaoComidaX = posicaoCasaX;
			this.posicaoComidaY = posicaoCasaY;
			return true;

		}
		else {
			return false;
		}
	}
	
	public void agir() {
		if (this.carrega) {
			System.out.println("A formiga deve ir para casa.");
		}
		else {
			System.out.println("A formiga deve buscar comida.");
		}
	}

}