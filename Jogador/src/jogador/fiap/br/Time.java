package jogador.fiap.br;

public class Time {
	
	private String nome;
	Goleiro Jogador1 = new Goleiro("Manuel Gomes", 1, 1.90, 1);
	Zagueiro Jogador2 = new Zagueiro("Daniel Freira",2, 1.53, 1);
	Zagueiro Jogador3 = new Zagueiro("Cara",3, 1.70, 1);
	Zagueiro Jogador4 = new Zagueiro("Matheus", 4, 1.90, 1);
	Zagueiro Jogador5 = new Zagueiro("Rodrigo Caio", 5, 1.85, 1);
	Atacante Jogador6 = new Atacante("Pedro Caio", 6, 1.89, 1);
	Atacante Jogador7 = new Atacante("Pedro Caio", 7, 1.89, 1);
	Atacante Jogador8 = new Atacante("Lucas Moura", 8, 1.78, 1);
	Atacante Jogador9 = new Atacante("Lucas Moura", 9, 1.78, 1);
	Atacante Jogador10 = new Atacante("Lucas Dourado", 8, 1.78, 1);
	Atacante Jogador11 = new Atacante("Henrique Dourado", 8, 1.78, 1);
		
	public Time(String nome) {
		super();
		this.nome = nome;
	}


	public void Jogar() {
		Jogador1.Agir();
		Jogador2.Agir();
		Jogador3.Agir();
		Jogador4.Agir();
		Jogador5.Agir();
		Jogador6.Agir();
		Jogador7.Agir();
		Jogador8.Agir();
		Jogador9.Agir();
		Jogador10.Agir();
		Jogador11.Agir();
		
	}
	

}
