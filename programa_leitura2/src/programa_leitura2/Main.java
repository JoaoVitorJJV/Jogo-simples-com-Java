package programa_leitura2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String nome;
		
		System.out.println("Digite o seu nome na linha abaixo");
		nome = sc.nextLine();
		System.out.println("Seja muito bem-vindo, "+nome+".");
		System.out.println("Digite a letra w");
		String comando;
		comando = sc.nextLine();
		
		if(comando.equals("w")) {
			System.out.println("Você está indo para frente!");
			System.out.println("Um inimigo surgiu, o que você deseja fazer? (a=atacar, b=correr)");
			comando = sc.nextLine();
			if(comando.equals("a")) {
				if(rand.nextInt(100) < 75) {
					System.out.println("Parabéns, você derrotou o inimigo!");
				}else {
					System.out.println("Você morreu.");
				}
			}else {
				System.out.println("Você correu!");
			}
		}else {
			System.out.println("Tecla incorreta.");
		}
		
	}
}
