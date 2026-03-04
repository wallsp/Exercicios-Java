package ExerciciosIniciais;

import java.util.Scanner;

public class MostraNumeroSolicitado {
    public static void main (String[] args) {
        System.out.println("Informe sua idade");
        
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();
        
        System.out.println("Sua idade é: " + idade);
    }
}