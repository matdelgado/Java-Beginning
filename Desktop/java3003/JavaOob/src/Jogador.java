
public class Jogador {

	public String nome;
	private int xp = 5;
	private int hp = 100;
	private boolean envenenado = false;
	

	//sobrecarga de métodos

	public Jogador() {
		
	}
	
	public Jogador(String nome) {
		System.out.println("Criando jogador chamados " + nome);
	}
	public int getXp() {
		return xp;
	}
	public int getHp() {
		return hp;
	
	}
	public String getNome() {
		return nome;
	}
	
	//get booleano é inicio is
	public boolean isEnvenenado() {
		return envenenado;
	}
	public void receberDano(int pontos) {
		this.hp -= pontos;
		if (this.hp <= 0) {
			System.out.println("Game Over" + nome);
			this.hp = 0;
		}
	}
	public void receberCura(int pontos) {
		this.hp += pontos;
	}
	
	public void ganharExperiencia(int pontos) {
		this.xp += pontos;
	}

	public void receberAntidoto() { //code smell 
		if (isEnvenenado()) {
			envenenado = false;
		}
		else {
			envenenado = true;
		}
	}
	
	//envenenado = isEnvenenado() ? false : true;
	//envenenado = !envenenado;
	//refatorar - programação em pares (melhorar um código)
	

	public void atacar(Jogador jogador) {
		
		//this -> jogador, um ataca o outro.
		
		jogador.receberDano(this.xp);
		if (jogador.foiDerrotado()) {
			this.ganharExperiencia(jogador.xp);
			
		}	
	}
	
	private boolean foiDerrotado() {
		return hp == 0;
		
	}
}
