import java.util.Scanner;

/*O IMC – Índice de Massa Corporal é um critério da
Organização Mundial de Saúde para dar uma indicação
sobre a condição de peso de uma pessoa adulta. A fórmula é
IMC = peso / ( altura )²
Elabore um algoritmo que leia o peso e a altura de um adulto
e mostre sua condição de acordo com a tabela abaixo.
Abaixo do Peso - Menos que 18,5
Peso Normal - 18,5 - 24,9
Sobrepeso - 25 - 29,9
Obesidade Grau I - 30 - 34,9
Obesidade Grau II - 35 - 39,9
Obesidade Grau III ou Mórbida - 40 ou maior


*/

public class IMCs {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a altura da pessoa: ");
        double altura = entrada.nextDouble();
        System.out.println("Informe o peso da pessoa: ");
        double peso = entrada.nextDouble();
        verificaIMC(peso,altura);
    }

    private static void verificaIMC(double peso, double altura) {
        double resultado = calculaIMC(peso, altura);
        if (resultado < 18.5)
            System.out.printf("Abaixo do Peso - IMC: %.2f", resultado);
        else if (resultado >= 18.5 && resultado < 25)
            System.out.printf("Peso Normal - IMC é: %.2f", resultado);
        else if (resultado >= 25 && resultado < 30)
            System.out.printf("Sobrepeso - IMC é: %.2f", resultado);
        else if (resultado >= 30 && resultado < 35)
            System.out.printf("Obesidade Grau I - IMC é: %.2f", resultado);
        else if (resultado >= 35 && resultado < 40)
            System.out.printf("Obesidade Grau II- IMC é: %.2f", resultado);
        else
            System.out.printf("Obesidade Grau III ou Mórbida - IMC: %.2f", resultado);
    }


    private static double calculaIMC(double peso, double altura){
        return (peso/Math.pow(altura, 2));
    }
}
