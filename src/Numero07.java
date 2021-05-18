import java.util.Scanner;

public class Numero07 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int qtdefeijao=0;
		
		System.out.println("Digite quantidade de feijões: ");
		qtdefeijao = leitor.nextInt();
		
		while(qtdefeijao != 1238) {
			System.out.println("Digite quantidade de feijões: ");
			qtdefeijao = leitor.nextInt();
		}
		
		System.out.println("Parabéns, você ganhou: ");
		leitor.close();
		

	}

}
