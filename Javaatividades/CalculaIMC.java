
public class CalculaIMC {
	public static void main(String[] args) {
		
		double pessoaMassa = 82.450;
		double pessoaAltura = 1.77;
		
		double pessoaIMC = pessoaMassa / (pessoaAltura * pessoaAltura) ; 

		System.out.println("O IMC dessa pessoa é de " + pessoaIMC);
		
		
	}
}
