import java.util.Scanner;

/*Crie um algoritmo que peça a altura e o peso de uma
pessoa. Calcule o IMC e informe se ele está dentro
do intervalo de 18,5 e 25. Considere a fórmula:
IMC = peso / ( altura )²
*/

public class ImcIdeal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a altura da pessoa: ");
        double altura = entrada.nextDouble();
        System.out.println("Informe o peso da pessoa: ");
        double peso = entrada.nextDouble();
        verificaIMC(peso,altura);
    }

    private static void verificaIMC(double peso, double altura){
        double resultado = calculaIMC(peso,altura);
        if(resultado >= 18.5 && resultado <= 25){
            System.out.printf("Parabéns, seu IMC é: %.2f", resultado);
        } else{
            System.out.printf("Infelizmente, seu IMC é: %.2f", resultado);
        }
    }

    private static double calculaIMC(double peso, double altura){
        return (peso/Math.pow(altura, 2));
    }
}
