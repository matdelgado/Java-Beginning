package fiap.com.jogo;

public class Jogo {

	public static void main(String[] args) {
		Guerreiro jogador1 = new Guerreiro("Fernando");
		Mago jogador3 = new Mago("Rodrigo");
		Dragao mob1 = new Dragao();
		BolaDeFogo mob2 = new BolaDeFogo(150);
		
		
		var fase = new Fase();
		
		fase.carregar(mob1);
		fase.carregar(mob2);
		fase.carregar(jogador3);
		fase.carregar(jogador1);
		
		System.out.println("Jogador1 " + jogador1.getNome()+ 
									"XP=" + jogador1.getXp() +
									" HP=" + jogador1.getHp() +   
									" Envenenado=" + jogador1.isEnvenenado()   
									);
		jogador1.ganharExperiencia(5);
		jogador3.ganharExperiencia(100);
		jogador1.receberAntidoto();
		jogador3.atacar(jogador1);
		jogador3.mover(15, 15);
		jogador1.mover(15,15);
		
		
		System.out.println("Jogador1 " + jogador1.getNome()+ 
				"XP=" + jogador1.getXp() +
				" HP=" + jogador1.getHp() +   
				" Envenenado=" + jogador1.isEnvenenado()   
				);
		     
		System.out.println("Jogador3 XP" + jogador3.getXp());
		
		
	}
	
	
	
	
}
