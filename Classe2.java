import java.security.SecureRandom;
public class Classe2{
	public static void main(String[] args){
		final SecureRandom number = new SecureRandom();
		final int[] freq = new int[6];
		
		for(int c = 0; c < 6000000; c++){
			++freq[number.nextInt(6)];
		}
		System.out.printf("%s", "Lado");
		System.out.printf("\t%10s%n", "Frequência");
		for(int i = 0; i < freq.length; i++){
			System.out.printf("   %-5d", (i+1));
			System.out.printf("%d%n", freq[i]);
		}	
	}
}
