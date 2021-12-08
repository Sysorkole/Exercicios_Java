import java.util.Scanner;

/*Faça um algoritmo para uma loja de 1,99. Leia
quantos itens foram vendidos. Conceda um desconto
de 5% e informe o valor final.*/

public class LojaDesconto2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe quantos itens você Comprou:");
        int qtddItens = entrada.nextInt();
        System.out.printf("Preço: R$ %.2f", (aplicaDesconto(1.99*qtddItens)));
    }

    public static Double aplicaDesconto(Double valor) {
        return valor*0.95;
    }
}
