package exercicio2;
/*2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).*/

import java.util.Scanner;

public class Tarefa5Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um valor: ");
		int v = sc.nextInt();

		if (v >= 0) {
			System.out.println("O valor é positivo ");
		} else {
			System.out.println("O valor é negativo ");
		}

		sc.close();

	}

}
