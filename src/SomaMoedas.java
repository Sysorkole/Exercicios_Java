
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
        int[] moedas = {1,5,10,25,50,100,200,500,1000,2500,5000,10000,20000};
        for (int i: moedas) {
            valorTotal += getMoney(i);
        }
        System.out.printf("Somatória: R$%d,%d", (int)valorTotal/100, (int)valorTotal%100);
    }

    private static int getMoney(int dinheiro){
        Scanner entrada = new Scanner(System.in);
        int valor;
        if(dinheiro==100){
            System.out.printf("Quantas moedas de %d Real: ", dinheiro/100);
            valor = entrada.nextInt();
            return valor*dinheiro;
        }else if(dinheiro>100){
            System.out.printf("Quantas cédulas de %d Reais: ", dinheiro/100);
            valor = entrada.nextInt();
            return valor*dinheiro;
        }else{
            System.out.printf("Quantas moedas de %d Centavo(s): ", dinheiro);
            valor = entrada.nextInt();
            return valor*dinheiro;
        }
    }

}
