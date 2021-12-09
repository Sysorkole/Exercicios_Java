import java.util.Scanner;

/*Elabore um algoritmo que calcule o que deve ser pago por
um produto, considerando o preço normal de etiqueta e a
escolha da condição de pagamento. Utilize os códigos da
tabela a seguir para ler qual a condição de pagamento
escolhida e efetuar o cálculo adequado.
Código - Condição de pagamento - Desconto/Juros:
● 1 - À vista em dinheiro ou cheque - 15% de desconto
● 2 - À vista no cartão de crédito - 5% de desconto
● 3 - Em duas vezes - sem desconto/juros
● 4 - Em seis vezes - juros de 10%*/

public class CodigoDesconto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada do Valor do Pagamento
        System.out.println("Informe o valor a ser pago: ");
        double valor = entrada.nextDouble();

        // Entrada da Forma de Pagamento
        System.out.println("1 - À vista em dinheiro ou cheque - 15% de desconto\n" +
                "2 - À vista no cartão de crédito - 5% de desconto\n" +
                "3 - Em duas vezes - sem desconto/juros\n4 - Em seis vezes - juros de 10%\n" +
                "Informe a opção de pagamento:");
        int pagamento = entrada.nextInt();

        //Processamento de Dados
        System.out.printf("Valor Final à ser pago: %.2f",valorFinal(valor,pagamento));

    }

    public static double valorFinal(double valor, int pagamento){
        switch (pagamento) {
            case 1:
                return valor*0.85;
            case 2:
                return valor*0.95;
            case 3:
                return valor;
            case 4:
                return valor*1.1;
            default:
                return valor;
        }
    }
}
