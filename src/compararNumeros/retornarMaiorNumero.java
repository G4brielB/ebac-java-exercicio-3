package compararNumeros;

import java.util.Scanner;

public class retornarMaiorNumero {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro numero:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro numero digitado: " + num1 + " é o maior numero");
        }else if (num1 < num2){
            System.out.println("O segundo numero digitado: " + num2 + " é o maior numero");
        } else {
            System.out.println("Os numeros são iguais.");
        }

    }
}
