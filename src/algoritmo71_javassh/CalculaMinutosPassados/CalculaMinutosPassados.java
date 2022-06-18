package algoritmo71_javassh.CalculaMinutosPassados;

import java.util.Scanner;

public class CalculaMinutosPassados {
		
	public static void main(String[] args) {
		CalculaMinutosPassados();//
	}

	private static void CalculaMinutosPassados(){
		
		Scanner scanner = new Scanner(System.in);
		int hora = scanner.nextInt();
		int minuto = scanner.nextInt();
		int tempoPassado = 0;
		
		tempoPassado = hora * 60 + minuto;
		
		System.out.println("Hora: "+hora+" Minuto: "+minuto+" TempoPassado: "+ tempoPassado);
		
	}
}
