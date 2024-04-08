package exercicio10;
/*10) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
  Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas 
  até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.*/

import java.util.Scanner;

public class Tarefa5Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o salário do vendedor: ");
		double salario = sc.nextDouble();

		System.out.println("Infortme a quantidade de vendas realizadas: ");
		double vendas = sc.nextDouble();

		double comissao;

		if (vendas <= 1500) {
			comissao = vendas * 0.03;
		} else {
			comissao = (1500 * 0.03) + ((vendas - 1500) * 0.05);

		}

		double salario_total = salario + comissao;
		System.out.println("O vendedor terá o salário total de: R$" + salario_total);

		sc.close();

	}

}
