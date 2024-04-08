package exercicio9;
/*9) A jornada de trabalho semanal de um funcionário é de 40 horas.
   O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
   Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, 
   que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).*/

import java.util.Scanner;

public class Tarefa5Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de horas trabalhadas: ");
		int qtd_hora = sc.nextInt();

		System.out.println("Informe o salário recebidopor hora: ");
		double salario_hora = sc.nextDouble();

		sc.close();

		int hora_semanal = 40;
		int qtd_semana_mes = 4;

		double total_salario = 0;

		if (qtd_hora <= salario_hora * qtd_semana_mes) {

			total_salario = qtd_hora * salario_hora;

		} else {
			int hora_extra = qtd_hora - (hora_semanal * qtd_semana_mes);
			double salario_extra = hora_extra * salario_hora * 1.5;
			total_salario = (hora_semanal * qtd_semana_mes * salario_hora) + salario_extra;

		}

		System.out.println("O salário total do funcionário é: R$" + total_salario);

	}

}
