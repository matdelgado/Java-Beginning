import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {

		int firstNumber = 0;
		int secondNumber = 0;
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite um número ");
		firstNumber = leitor.nextInt();
		System.out.print("Digite outro número: ");
		secondNumber = leitor.nextInt();
		leitor.close();
		
		int mediaNumeros = (firstNumber + secondNumber) / 2;
		
		
		System.out.print("A média é: " + mediaNumeros);
		
	}
}
