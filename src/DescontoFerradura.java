import java.util.Scanner;

public class DescontoFerradura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de cavalos:");
        int QtdCavalos = entrada.nextInt();
        System.out.printf("Custo: R$ %.2f", giveDiscount(4*9.90*QtdCavalos));
    }

    private static double giveDiscount(double verifica){
        if(verifica >= 100){
            verifica *= 0.9;
        }
        return verifica;
    }
}
