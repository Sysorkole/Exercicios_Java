import java.util.Scanner;

/*Tendo como dados de entrada a altura e o sexo de
uma pessoa, construa um algoritmo que calcule seu
peso ideal, utilizando as seguintes fórmulas:
● para homens: (72.7 * h) – 58;
● para mulheres: (62.1 * h) – 44.7.*/

public class PesoIdeal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.printf("Homem ou Mulher: ");
        String sexo = entrada.nextLine();
        System.out.printf("Informe a altura: ");
        double altura = entrada.nextDouble();
        if(sexo.equals("homem") || sexo.equals("Homem")){
            System.out.printf("Peso Ideal = %.2f", ((62.1 * altura) - 44.7));
        }else if(sexo.equals("mulher") || sexo.equals("Mulher")){
            System.out.printf("Peso Ideal = %.2f", ((72.7 * altura) - 58));
        }
    }
}
