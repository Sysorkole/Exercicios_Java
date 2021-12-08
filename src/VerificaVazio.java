
/*Solicite o nome, e-mail, rg e cpf da pessoa. Faça uma
validação simples para verificar se todos os campos
foram preenchidos*/

import java.util.Scanner;

public class VerificaVazio {
    public static void main(String[] args) {
        String[] campo = {"nome","email","rg","cpf"};
        String[] dados = new String[4];
        Scanner entrada = new Scanner(System.in);
        int i;
        boolean erro;
        for(i=0;i<4;i++) {
            String valor;
            do {
                System.out.printf("Informe seu %s: ", campo[i]);
                valor = entrada.nextLine();
                erro = emptyVerification(valor);
            } while (erro);
            dados[i] = valor;
        }
        //Se quiser printar os valores: printData(dados,campo);
    }

    private static boolean emptyVerification(String valor){
        if(valor.equals("") || valor.equals(" ")){
            System.out.println("ERRO: CAMPO VAZIO...");
            return true;
        }
        return false;
    }

    private static void printData(String[] valor, String[] campo){
        int i;
        for(i=0;i< valor.length;i++){
            System.out.printf("Seu %s é %s\n", campo[i],valor[i]);
        }
    }
}
