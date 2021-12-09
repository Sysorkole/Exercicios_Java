
/*Mostre o seu nome 7 vezes na tela.
Conte de 1 até 20.
Leia o nome da pessoa e imprima ele 15 vezes na tela.
Leia um número, depois calcule e mostre a tabuada.
Leia dois números, calcule e informe a soma. Pergunte se
deseja calcular novamente.
Leia o nome da pessoa. Caso ela deixe em branco
solicite para digitar novamente.
Leia um número, calcule o fatorial deste número e mostre
o resultado*/

import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaDois = new Scanner(System.in);
        int iteravel = 0;
        int numeroUm;
        int numeroDois;
        String resposta;
        boolean verificacao;

        // Printa 7 vezes meu nome
        for(iteravel = 0; iteravel < 7; iteravel++)
            System.out.println("Arthur");

        // Printa de 1 a 20
        for(iteravel = 1; iteravel <= 20; iteravel++)
            System.out.printf("\nNúmero: %d", iteravel);

        // Printa o nome solicitado 15 vezes
        System.out.println("\nInforme um nome: ");
        String nome = entrada.nextLine();
        for(iteravel = 0; iteravel < 15; iteravel++)
            System.out.printf("\n%d - %s", iteravel+1, nome);

        // Faz a tabuada do número solicitado
        System.out.println("\nInforme um número: ");
        numeroUm = entrada.nextInt();
        for(iteravel=1;iteravel<=10;iteravel++)
            System.out.printf("\n%d x %d = %d", iteravel, numeroUm, iteravel*numeroUm);

        // Pede dois número, soma, e pergunta se quer calcular dnv
        do {
            System.out.println("\nInforme o primeiro número: ");
            numeroUm = entrada.nextInt();
            System.out.println("Informe o segundo número: ");
            numeroDois = entrada.nextInt();
            System.out.printf("\nSoma: %d", numeroUm+numeroDois);

            System.out.println("\nDeseja calcular novamente: ");
            resposta = entradaDois.nextLine();
            if(resposta.equals("sim") || resposta.equals("Sim")){
                verificacao = true;
            }
            else{
                verificacao = false;
            }

        }while(verificacao==true);

        // Verifica se é vazio ou branco o nome solicitado
        do {
            System.out.println("Informe seu Nome: ");
            nome = entradaDois.nextLine();
            emptyVerification(nome);
        }while (emptyVerification(nome)==true);

        // Faz o fatorial do número pedido
        System.out.println("\nNúmero para Fatorial: ");
        numeroUm = entradaDois.nextInt();
        System.out.printf("Fatorial de %d: %d", numeroUm,fatorial(numeroUm));
    }

    // Função que verifica se há branco ou vazio e retorna true or false
    private static boolean emptyVerification(String valor){
        if(valor.equals("") || valor.equals(" ")){
            System.out.println("ERRO: CAMPO VAZIO...");
            return true;
        }
        return false;
    }

    // Função que faz o fatorial do número enviado
    private static int fatorial(int numero){
        int fatorial = 1, contador;
        for(contador=1;contador<=numero;contador++)
            fatorial *= contador;
        return fatorial;
    }
}
