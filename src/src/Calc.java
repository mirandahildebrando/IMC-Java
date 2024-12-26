package src;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo ao programa de IMC");
		System.out.println("Digite seu peso: ");
		
		Double peso = scanner.nextDouble();
		
		System.out.println("Digite sua altura: ");
		
		Double altura = scanner.nextDouble();
		
		Double imc = peso / (altura * altura);
		
		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso.");
		} else if (imc < 24.9) {
			System.out.println("Você está no peso ideal, parabens!");
		} else if(imc < 29.9) {
			System.out.println("Você está acima do peso, procure um nutricionista.");
		} else if(imc < 40.0) {
			System.out.println("Você está obeso, procure um médico");
		} else{
			System.out.println("Obesidade grave, procure um médico");
		}

	}

}
