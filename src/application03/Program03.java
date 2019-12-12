package application03;

import java.util.Locale;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa de avaliação de produtos");
		System.out.println();
		System.out.println("1. Alcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");
		System.out.println("4. Finalizar a avaliação");
		System.out.println();
		System.out.print("Digite o código do produto consumido: ");
		int n = sc.nextInt();
		int alcool = 0, diesel = 0, gasolina = 0; 
		
		while(n != 4 ) {
			if(n == 1) {
				alcool += 1;
			}else if(n == 2) {
				gasolina += 1;
			}else if(n == 3) {
				diesel += 1;
			}
			System.out.println();
			System.out.print("Se consumiu mais algum, informe por gentileza: ");
			n = sc.nextInt();
		}
		System.out.println();
		System.out.println("Obrigado pela preferência");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
