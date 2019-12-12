package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa verificador de senha.");
		System.out.print("Informe sua senha de 4 digitos: ");
		int n = sc.nextInt();
		
		while(n != 2002) {
			System.out.println("Senha inválida, tente novamente");
			n = sc.nextInt();
		}
		System.out.println("Correto!");
		
		sc.close();
	}

}
