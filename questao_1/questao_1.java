import java.util.Scanner;

public class questao_1 {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		float pj1, pj2, pa;

		System.out.print("Entre com a nota do projeto 1: ");
		pj1 = in.nextFloat();
		
		System.out.print("Entre com a nota do projeto 2: ");
		pj2 = in.nextFloat();
		
		System.out.print("Entre com a participação: ");
		pa = in.nextFloat();
		
		float cf = (float) Math.round((((pj1 * 2) + (pj2 * 3)) / 5 ) * 0.9 + pa * 0.1);
		System.out.println("Sua nota final eh: " + cf);

		if(cf >= 6) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		in.close();

	}
}
