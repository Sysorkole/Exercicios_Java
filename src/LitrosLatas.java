/*Uma fábrica de refrigerantes vende seu produto em
três formatos: lata de 350 ml, garrafa de 600 ml e
garrafa de 2 litros. Se um comerciante compra uma
determinada quantidade de cada formato, faça um
algoritmo para calcular quantos litros de refrigerante
ele comprou. */

import java.util.Scanner;

public class LitrosLatas {
    public static void main(String[] args) {

        int valorTotal = 0;
        int[] latas = {350,600,2000};
        for (int i: latas) {
            valorTotal += getLiquid(i);
        }
        System.out.printf("Quantidade total de Litros: %d", valorTotal);
    }

    private static int getLiquid(int medida){
        System.out.printf("Quantas latas de %d ml: ", medida);
        Scanner entrada = new Scanner(System.in);
        int quantidade = entrada.nextInt();
        return quantidade*medida;
    }
}
