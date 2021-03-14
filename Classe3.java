/*
Vinte estudantes foram solicitados a classificar em uma escala de 1 a 5 a qualidade da comida no refeitório estudantil, com 1 sendo “horrível” e 5 sendo “excelente”. Coloque as 20 respostas em um array de inteiros e determine a frequência de cada classificação.
*/
import java.util.Scanner;
public class Classe3{
	static final int NUM_ESTUDANTES = 20;
	static final int NOTAS = 5;
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args){		
		int[] respostas = new int[NUM_ESTUDANTES];
		int[] freq = new int[NOTAS];
		
		System.out.println("Insira a resposta dos alunos para calcular a frequencia de cada clasificação");

		for(int c = 0; c < NUM_ESTUDANTES; c++){
			System.out.printf("Insira a resposta do estudante número %-2d: ", (c + 1));
			respostas[c] = input.nextInt();
			//System.out.println();
			while(respostas[c] < 1 || respostas[c] > 5){
				System.out.print("Número inválido, tente novamente: ");
				respostas[c] = input.nextInt();			
			}
		}
		for(int c = 0; c < NUM_ESTUDANTES; c++){
			++freq[respostas[c] - 1];
		}
		System.out.printf("%n%s", "Qualidade de [1-5]");
		System.out.printf("  %s%n", "Frequência de respostas");
		for(int c = 0; c < NOTAS; c++){
			System.out.printf("\t\t %d", (c + 1));
			System.out.printf("%25d%n", freq[c]);
		}
	}
}
