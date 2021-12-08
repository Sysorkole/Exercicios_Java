/*Leia as medidas(b, h) de um retângulo. Escreva a
área calculada.*/

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base = entrada.nextInt();
        int altura = entrada.nextInt();
        System.out.println("Área do Retângulo: " + (base*altura));
    }
}
