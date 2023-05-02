package jogador.fiap.br;

public class Zagueiro extends Jogador{
	
	private int desarmesFeitos;

	public Zagueiro(String nome, int camisa, double altura, int desarmesFeitos) {
		super(nome, camisa, altura);
		this.desarmesFeitos = desarmesFeitos;
	}
	
	@Override
	public void Agir() {
		System.out.println("Zagueiro " + getName() + "está defendendo");
		
	}
	
		

}
