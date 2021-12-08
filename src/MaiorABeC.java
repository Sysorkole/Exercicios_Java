import java.util.Scanner;

public class MaiorABeC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int valorUm = entrada.nextInt();
        System.out.println("Informe o segundo valor: ");
        int valorDois = entrada.nextInt();
        System.out.println("Informe o terceiro valor: ");
        int valorTres = entrada.nextInt();
        maior(valorUm,valorDois,valorTres);
    }

    private static void maior(int a, int b, int c){
        if((a + b) > c){
            System.out.println("A + B é maior que C...");
        }else if((a + b) == c){
            System.out.println("(A + B) e C tem o mesmo valor...");
        }else{
            System.out.println("C é maior...");
        }
    }
}
