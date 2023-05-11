package br.com.fiap.rh;

public class FolhaDePagamento {

	private double total;
	
	
	public void registrar(Funcionario funcinario) {

		total = getTotal() + funcinario.calcularSalario();
		
	}
	
	public double getTotal() {
		return total;
	}
	
	public void login(Autenticavel autenticavel, String senha) {
		if (autenticavel.autenticar(senha)) {
			System.out.println(autenticavel.getClass().getSimpleName() + " Autenticado");
		}
	}
	
	
	
	
}
