package exercicio3;
/*3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se foremcompradas pelo menos 12. 
 * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.*/

import java.util.Scanner;

public class Tarefa5Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de maçãs compradas: ");
		int quantasMacas = sc.nextInt();

		double total;

		if (quantasMacas < 12) {
			total = quantasMacas * 1.30;
		} else {
			total = quantasMacas * 1.00;

		}

		System.out.println("O valor total de compra é: R$ " + total);

		sc.close();
	}

}
