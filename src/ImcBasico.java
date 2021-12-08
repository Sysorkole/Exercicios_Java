import java.util.Scanner;

public class ImcBasico {

    /*Crie um algoritmo que peça a altura e o peso de uma
    pessoa. Calcule e informe o IMC.
    Considere a fórmula: IMC = peso / ( altura )²
    */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a altura da pessoa: ");
        double altura = entrada.nextDouble();
        System.out.println("Informe o peso da pessoa: ");
        double peso = entrada.nextDouble();
        System.out.printf("IMC: %.2f", (calculaIMC(peso,altura)));
    }

    private static double calculaIMC(double peso, double altura){
        return (peso/Math.pow(altura, 2));
    }

}
