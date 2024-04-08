package exercicio4;
/*4) Ler as notas da 1a. e 2a. avaliações de um aluno.
 *  Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.*/

import java.util.Scanner;

public class Tarefa5Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a nota da primeira avaliação: ");
		double n1 = sc.nextInt();

		System.out.println("Informe a nota da segunda avaliação: ");
		double n2 = sc.nextInt();

		double media = (1 + 2) / 2;

		if (media >= 6.0) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");

		}
		System.out.println("Média final: " + media);

		sc.close();

	}

}
