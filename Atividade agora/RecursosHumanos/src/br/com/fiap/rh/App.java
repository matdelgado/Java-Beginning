package br.com.fiap.rh;

public class App {

	public static void main(String[] args) {
		
		var gerente = new Gerente();
		gerente.setBonus(1000);
		var engenheiro = new Engenheiro();
		var presidente = new Presidente();
		presidente.setValorDaCotaDeAcoes(900_000);
		
		
		System.out.println(gerente.calcularSalario());
		System.out.println(engenheiro.calcularSalario());
		System.out.println(presidente.calcularSalario());
		
		var folhaDePagamento = new FolhaDePagamento();
		folhaDePagamento.registrar(gerente);
		folhaDePagamento.registrar(engenheiro);
		folhaDePagamento.registrar(presidente);
		
		presidente.setSenha("123456");
		gerente.setSenha("abc");
		
		folhaDePagamento.login(presidente, "123456");
		folhaDePagamento.login(gerente, "abc");
		
		
		System.out.println(folhaDePagamento.getTotal());
		
	}

}
