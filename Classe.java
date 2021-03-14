/*
Você lança dois dados. Cada dado tem seis faces que contêm um, dois, três, quatro, cinco e seis pontos,
respectivamente. Depois que os dados param de rolar, a soma dos pontos nas faces viradas para cima é calculada.
Se a soma for 7 ou 11 no primeiro lance, você ganha. Se a soma for 2, 3 ou 12 no primeiro lance (chamado
“craps”), você perde (isto é, a “casa” ganha). Se a soma for 4, 5, 6, 8, 9 ou 10 no primeiro lance, essa soma torna-
-se sua “pontuação”. Para ganhar, você deve continuar a rolar os dados até “fazer sua pontuação” (isto é, obter
um valor igual à sua pontuação). Você perde se obtiver um 7 antes de fazer sua pontuação.
*/
import java.security.SecureRandom;
import java.util.Scanner;
public class Classe{
	private static final Scanner input = new Scanner(System.in);
	private static final SecureRandom valorDado = new SecureRandom();

	public static void main(String[] args){
		int somaDosDados = 0;
		int pontos = 0;
		boolean fimDeJogo = false;
		exibeRegras();
		System.out.print("Aberte enter para rolar os dados: ");
		input.nextLine();
		System.out.println();
		pontos = rolaDados();
		if(pontos == 2 || pontos == 3 || pontos == 12){
			fimDeJogo = true;
			System.out.println("Você perdeu, pois a soma dos dados é: " + pontos);
		}else if(pontos == 7 || pontos == 11){
			fimDeJogo = true;
			System.out.println("Você ganhou, pois a soma dos dados é: " + pontos);
		}
		while(!fimDeJogo){
			System.out.println("Pontuação: " + pontos);
			System.out.print("\nAberte enter para rolar os dados: ");
			input.nextLine();
			System.out.println();
			somaDosDados = rolaDados();
			if(somaDosDados == 7){
				fimDeJogo = true;
				System.out.println("Você perdeu.");
			}else if(somaDosDados == pontos){
				fimDeJogo = true;
			//	System.out.println("Sua pontuação: " + pontos);
				System.out.println("Você ganhou");
			}
		}					
	}
	private static void exibeRegras(){	
		System.out.println("\t\t\t*** REGRAS ***");
		System.out.println("Lance dois dados, sua pontuação será igual a soma dos dados."); 
		System.out.println("Se sua pontuação for 7 ou 11, você ganha."); 
		System.out.println("Se sua pontuação for 2, 3 ou 12, você perde.");
		System.out.println("Se sua pontuação for diferente desses valores o jogo prosseguirá com a seguinte regra: ");
		System.out.println();
		System.out.println("Para ganhar, você deve continuar a rolar os dados até obter sua pontuação.");
		System.out.println("Você perde se obtiver uma soma de dados igual a 7 antes de fazer sua pontuação.");
		System.out.println();
	}	
	private static int rolaDados(){
		int dado1 = 1 + valorDado.nextInt(6);
		int dado2 = 1 + valorDado.nextInt(6);
		System.out.println("Valor do primeiro dado: " + dado1);
		System.out.println("Valor do segundo dado: " + dado2);
		System.out.println("Soma dos dados: " + (dado1 + dado2));
		System.out.println();
		return dado1 + dado2;
	}		
}
