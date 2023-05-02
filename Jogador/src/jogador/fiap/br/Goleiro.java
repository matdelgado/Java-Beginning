package jogador.fiap.br;

public class Goleiro extends Jogador{
	
	private int defesasRealizadas;

	public Goleiro(String nome, int camisa, double altura, int defesasRealizadas) {
		super(nome, camisa, altura);
		this.defesasRealizadas = defesasRealizadas;
	}

	@Override
	public void Agir() {
		System.out.println("Goleiro " + getName() + "está defendendo");
		
	}
	
	
}
