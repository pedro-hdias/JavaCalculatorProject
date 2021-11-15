package MyFirstCalculator;

import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
		int getInputUserMenu;
		Scanner inputKeyboard = new Scanner(System.in);
		BasicCalculationsMethods reference = new BasicCalculationsMethods();
		System.out.println(
				"Seja bem-vindo (a) à calculadora simples.\nVersão 1.0α.\nEste projeto está no github: http://www.github.com/pedro-hdias/JavaCalculatorProject/");
		do {
			System.out.println("Escolha sua opção:\n1. Soma;\n2. Subtração;\n3. Multiplicação;\n4. Divisão;\n0. Sair.");
			getInputUserMenu = inputKeyboard.nextInt();
			switch (getInputUserMenu) {
			case 1: {
				System.out.println("Soma!\nApenas consigo, ainda, fazer com 2 dígitos.\nDigite o primeiro número: ");
				int sum1 = inputKeyboard.nextInt();
				System.out.println("Agora o segundo: ");
				int sum2 = inputKeyboard.nextInt();
				reference.Sum(sum1, sum2);
			} case 2: {
				System.out.println("Subtração!\nAinda consigo apenas com 2 números.\nDigite o primeiro, lembre-se maior que o segundo.");
				int sub1 = inputKeyboard.nextInt();
				System.out.println("Agora o segundo:");
				int sub2 = inputKeyboard.nextInt();
				if (sub1 > sub2) {
					reference.Subtraction(sub1, sub2);
				} else {
					System.out.printf("É impossível subtrair %d de %d. \n", sub1, sub2);
				}
			}
			default:
				// throw new IllegalArgumentException("Unexpected value: " + 1);
			}
		} while (getInputUserMenu > 0);
		System.out.println("Tchau!");
		inputKeyboard.close();
	}

}
