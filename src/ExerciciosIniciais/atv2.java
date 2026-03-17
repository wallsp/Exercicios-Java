package ExerciciosIniciais;

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Voce é menor de idade");
        }

        entrada.close();
    }
}