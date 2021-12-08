import java.util.Scanner;

public class ValorMaior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int valorUm = entrada.nextInt();
        System.out.println("Informe o segundo valor: ");
        int valorDois = entrada.nextInt();
        maior(valorUm,valorDois);
    }

    private static void maior(int a, int b){
        if(a > b){
            System.out.println("Primeiro valor é maior...");
        }else if(a == b){
            System.out.println("Ambos tem o mesmo valor...");
        }else{
            System.out.println("Segundo valor é maior...");
        }
    }
}
