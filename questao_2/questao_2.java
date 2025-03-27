import java.util.Scanner;

public class questao_2 {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int ano_atual, ano;

		System.out.println("Entre com o seu nome: ");
		String name = in.nextLine(); // Tiago
		
		System.out.println("Entre com o ano que nasceu: ");
		ano = in.nextInt(); // 2005
		
		System.out.println("Entre com o ano atual: ");
		ano_atual = in.nextInt(); // 2025 
		
		System.out.printf("%s, possui %d anos.\n", name, ano_atual - ano);

	}
}
