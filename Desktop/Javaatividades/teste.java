import java.util.Scanner;

public class AtividadeGimini {
	public static void main(String[] args) {
		
		String userName;
		String userEmail;
		long phoneNumber; 
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		userName = leitor.nextLine();
		System.out.print("Digite o seu e-mail: ");
		userEmail = leitor.nextLine();
		System.out.print("igite o seu telefone: ");
		phoneNumber = leitor.nextLong();
		leitor.close();
		
		System.out.println("Olá, " + userName + "\nSeja bem-vindo!!!");
		System.out.println("O seu e-mail é " + userEmail + ", e o seu telefone é " + phoneNumber);
		
		
	}
}
