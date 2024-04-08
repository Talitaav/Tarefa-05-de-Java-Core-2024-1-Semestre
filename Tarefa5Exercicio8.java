package exercicio8;

/*8) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, 
 sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte*/

import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Tarefa5Exercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o início do jogo: ");
		int inicio = sc.nextInt();

		System.out.println("Informe o fim do jogo: ");
		int fim = sc.nextInt();

		long tempo = calcular(inicio, fim);

		System.out.println("A duração do jogo foi de " + tempo + " h.");

		sc.close();

	}

	public static long calcular(int inicio, int fim) {
		LocalTime horaI = LocalTime.of(inicio, 0);
		LocalTime horaF = LocalTime.of(fim, 0);

		if (horaI.isAfter(horaF)) {
			horaF = horaF.plus(1, ChronoUnit.DAYS);
		}

		long tempo = horaI.until(horaF, ChronoUnit.HOURS);

		tempo = Math.min(tempo, 24);

		return tempo;

	}
}