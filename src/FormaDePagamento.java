import java.util.Scanner;

public class FormaDePagamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcaoDePagamento = 0;

        System.out.println("Informe o valor: ");
        int valor = entrada.nextInt();

        do {
            System.out.println("Pagamentos:\n0 - A vista\n1 - Parcelar\nDigite sua opção: ");
            opcaoDePagamento = entrada.nextInt();
        }while (opcaoDePagamento != 1 && opcaoDePagamento != 0);

        System.out.printf("O valor total é de: %.2f",giveDiscount(valor,opcaoDePagamento));
    }

    private static double giveDiscount(int valor, int op){
        if(op==0)
            valor *= 0.90;
        else
            valor *= 0.95;
        return valor;
    }


}
