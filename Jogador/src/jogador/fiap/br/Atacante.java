package jogador.fiap.br;

public class Atacante extends Jogador{
	
	private int golsMarcados;

	
	
	public Atacante(String nome, int camisa, double altura, int golsMarcados) {
		super(nome, camisa, altura);
		this.golsMarcados = golsMarcados;
	}

	@Override
	public void Agir() {
		System.out.println("Atacante " + getName() + "está atacando");
		
	}
	

}
