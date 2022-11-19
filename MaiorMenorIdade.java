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
			System.out.println("Você tem " + idade + " anos");
			if (idade >= 18) {
				System.out.println("Você é maior de idade!");
			} else {
				System.out.println("Você é menor de idade!");
			}
			System.out.println("Deseja continuar? 1- Sim 2- Não");
			resposta = leitura.nextInt();
			i++;
			
		}while(resposta!=2);
			
	}

}
