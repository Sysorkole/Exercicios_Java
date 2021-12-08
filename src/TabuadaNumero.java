/*Leia um número de 1 a 10, calcule e mostre a
tabuada.*/

import java.util.Scanner;

public class TabuadaNumero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.printf("Informe um número: ");
        int numero = entrada.nextInt();
        int[] tabuada = {1,2,3,4,5,6,7,8,9,10};
        for (int i: tabuada) {
            System.out.printf("%d x %d = %d\n",numero,i,(numero*i));
        }
    }
}
