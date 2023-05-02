package jogador.fiap.br;

public class Jogador {

	private String nome;
	private int camisa;
	private double altura;
	
	
	public Jogador(String nome, int camisa, double altura) {
		super();
		this.nome = nome;
		this.camisa = camisa;
		this.altura = altura;
	}
	
	public void Agir() {
		System.out.println();
		
	}
	
	public String getName() {
		return this.nome;
	}
	
}
