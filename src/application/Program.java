package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao 'Média das Alturas'");
		System.out.println("Por favor, insira quantas pessoas informarão seus dados: ");
		
		int n = sc.nextInt();			
		double[] vect = new double[n]; 
		
		System.out.println("Por favor, insira as alturas em sequencia: ");
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];			
		}
		
		
		double avg = sum/n;		
		System.out.printf("A média das alturas é: %.2f%n", avg);
		
		
		
		
		sc.close();
	}

}
