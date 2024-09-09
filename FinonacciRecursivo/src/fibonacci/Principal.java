package fibonacci;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		int num;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o termo Fibonacci: ");
		num = leitor.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.print(Fibonacci.fib(i) + "\n");
		}
	}

}