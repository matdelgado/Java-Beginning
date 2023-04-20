package atividade.fiap.loja;

public class App {

	public static void main(String[] args) {
		
		Livro livro = new Livro("A revolução dos bixos", 25.90, "Livro", 5, "George Owell");
		Livro livro2 = new Livro("Diário de um Banana", 30.00, "Livro", 15, "Na");
		Livro livro3 = new Livro("172 horas na Lua", 35.62, "Livro", 20, "Na");
		
		Eletronico eletronico1 = new Eletronico("Geladeira Super boa" , 20.00, "Geladeira", 1, "Electrolux", "Frostfree-muito boa");
		Eletronico eletronico2 = new Eletronico("Televisao 1", 150.00, "Televisão", 1, "LG", "128gb");
		Eletronico eletronico3 = new Eletronico("Celular do Matheus", 250.00, "Celular", 1, "Apple", "Iphone 15");
		
		
		
	}

}
