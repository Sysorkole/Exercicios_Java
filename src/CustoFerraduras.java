import java.util.Scanner;

/* Sabendo que cada cavalo precisa de 4 ferraduras e
que cada unidade custa 9,90, pergunte quantos
cavalos precisam de ferraduras. Depois calcule e
informe o valor final. */

public class CustoFerraduras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de cavalos:");
        int QtdCavalos = entrada.nextInt();
        System.out.println("Custo: R$" + (4*9.90*QtdCavalos));
    }
}
