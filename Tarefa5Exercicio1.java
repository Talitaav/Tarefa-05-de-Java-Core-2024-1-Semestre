package exercicio1;
/*1) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso

contrário escrever NÃO É MAIOR QUE 10!*/

import java.util.Scanner;

public class Tarefa5Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um valor: ");
		int v = sc.nextInt();

		if (v > 10) {
			System.out.println("É maior que 10!");
		} else {
			System.out.println("Não é maior que 10!");
		}
		
		sc.close();

	}

}
