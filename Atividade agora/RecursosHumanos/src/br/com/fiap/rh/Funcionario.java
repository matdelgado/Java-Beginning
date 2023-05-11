package br.com.fiap.rh;

//Abstract não permite criar objetos, ex, não pode criar o Funcionario funcionario = new Funcionario;

public abstract class Funcionario {
	
	private long id;
	private String nome;
	
	public double calcularSalario() {
		return 1320;
	}
	
}
