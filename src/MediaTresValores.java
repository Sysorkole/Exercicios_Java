
/*Leia três valores (A, B e C). Informe média.*/

import java.util.Scanner;

public class MediaTresValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        int primeiroValor = entrada.nextInt();
        System.out.println("Informe o segundo valor:");
        int segundoValor = entrada.nextInt();
        System.out.println("Informe o terceiro valor:");
        int terceiroValor = entrada.nextInt();
        System.out.println("Média: " + ((primeiroValor+segundoValor+terceiroValor)/3));
    }
}
