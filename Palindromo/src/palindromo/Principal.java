package palindromo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Palindromo p = new Palindromo();
        Scanner leitor = new Scanner(System.in);
        String continuar = "sim";

            System.out.println("Digite uma palavra para verificar: ");
            String palavra = leitor.nextLine();

            p.verificar(palavra);

            System.out.println("Deseja verificar outra palavra? (sim/não)");
            continuar = leitor.nextLine();

        while (continuar.equalsIgnoreCase("sim"));

        System.out.println("Saindo...");
    }
}