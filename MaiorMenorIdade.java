import java.util.Scanner;
public class MaiorMenorIdade {
	

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int i, anoAtual, anoNasc, idade, resposta;
		i = 1;
		
		do {
			System.out.println("Digite o ano atual: ");
			anoAtual = leitura.nextInt();
			System.out.println("Digite do seu ano de nascimento:");
			anoNasc = leitura.nextInt();
			idade = anoAtual-anoNasc;
			System.out.println("Voc� tem " + idade + " anos");
			if (idade >= 18) {
				System.out.println("Voc� � maior de idade!");
			} else {
				System.out.println("Voc� � menor de idade!");
			}
			System.out.println("Deseja continuar? 1- Sim 2- N�o");
			resposta = leitura.nextInt();
			i++;
			
		}while(resposta!=2);
			
	}

}
