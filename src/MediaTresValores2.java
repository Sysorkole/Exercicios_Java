import java.util.Scanner;



public class MediaTresValores2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        int primeiroValor = entrada.nextInt();
        System.out.println("Informe o segundo valor:");
        int segundoValor = entrada.nextInt();
        System.out.println("Informe o terceiro valor:");
        int terceiroValor = entrada.nextInt();
        System.out.printf("Média: %.2f", (float) ((primeiroValor+segundoValor+terceiroValor)/3));
    }
}
