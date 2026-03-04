package ExerciciosIniciais;

import java.util.Scanner;

public class SomaDoisInteiros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite a operacao (+ - * /):");
        String operacao = entrada.next();

        System.out.println("Digite o segundo numero:");
        double numero2 = entrada.nextDouble();

        double resultado = 0;

        if (operacao.equals("+")) {
            resultado = numero1 + numero2;
        } else if (operacao.equals("-")) {
            resultado = numero1 - numero2;
        } else if (operacao.equals("*")) {
            resultado = numero1 * numero2;
        } else if (operacao.equals("/")) {
            resultado = numero1 / numero2;
        }

        System.out.println("O resultado é: " + resultado);

        entrada.close();
    }
}