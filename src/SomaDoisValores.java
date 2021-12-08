import java.util.Scanner;

/*Leia dois valores (A e B) e informe a soma*/

public class SomaDoisValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        int primeiroValor = entrada.nextInt();
        System.out.println("Informe o segundo valor:");
        int segundoValor = entrada.nextInt();
        System.out.println("Soma: " + (primeiroValor+segundoValor));
    }
}
