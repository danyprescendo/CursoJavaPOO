package vectors.exercise_II;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += alturas[i];
		}
		double avgAlturas = sum / n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", avgAlturas);
		
		int count = 0;
		for (int i=0; i<n; i++) {
			if(idades[i] < 16) {
				count += 1;
			}
		}
		
		double percent = count * 100.0 / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		
		for (int i=0; i<n; i++) {
			if(idades[i] < 16) {
				System.out.println(nomes[i]);;
			}
		}
		
		sc.close();
	}

}
