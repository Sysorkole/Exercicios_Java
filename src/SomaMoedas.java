
/*Pedrinho tem um cofrinho com muitas moedas, e
deseja saber quantos reais conseguiu poupar. Faça
um algoritmo para ler a quantidade de cada tipo de
moeda, e imprimir o valor total economizado, em
reais. Considere que existam moedas de 1, 5, 10, 25
e 50 centavos, e ainda moedas de 1 real. */

import java.util.Scanner;

public class SomaMoedas {

    public static void main(String[] args) {

        int valorTotal = 0;
        int[] moedas = {1,5,10,25,50};
        for (int i: moedas) {
            valorTotal += getCoin(i);
        }
        System.out.printf("Somatória: %d reais e %d centavos", (int)valorTotal/100, (int)valorTotal%100);
    }

    private static int getCoin(int moeda){
        System.out.printf("Quantas moedas de %d Centavo(s): ", moeda);
        Scanner entrada = new Scanner(System.in);
        int centavo = entrada.nextInt();
        return centavo*moeda;
    }

}
