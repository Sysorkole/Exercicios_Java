import java.util.Scanner;

/*Solicite um número de 1 a 12 e informe o mês escolhido por
extenso.
Solicite um número de 0 a 6 e informe o dia da semana por
extenso.
Solicite um animal e mostre em inglês. (Ex.: gato, cachorro,
etc..)*/

public class EscolhaOpcoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Leitura do Dia da Semana
        System.out.println("1 - Janeiro\n" +
                "2 - Fevereiro\n3 - Março\n4 - Abril\n5 - Maio\n" +
                "6 - Junho\n7 - Julho\n8 - Agosto\n9 - Setembro\n" +
                "10 - Outubro\n11 - Novembro\n12 - Dezembro\n" +
                "Informe o número do mês:");
        int mes = entrada.nextInt();

        //Saída do Dia da Semana
        System.out.printf("Você selecionou: %s\n", mes(mes));

        // Leitura do Dia da Semana
        System.out.println("\n0 - Domingo\n" +
                "1 - Segunda\n2 - Terça\n3 - Quarta\n4 - Quinta\n" +
                "5 - Sexta\n6 - Sabado\nInforme o número do dia:");
        int dia = entrada.nextInt();

        //Saída do Dia da Semana
        System.out.printf("Você selecionou: %s\n", dia(dia));

        // Leitura do Animal
        System.out.println("\n0 - Gato\n" +
                "1 - Cachorro\n2 - Cobra\n3 - Pássaro\n4 - Vaca\n" +
                "5 - Galinha\n6 - Zebra\nInforme o número do animal:");
        int animal = entrada.nextInt();

        //Saída do Animal
        System.out.printf("Você selecionou: %s\n", animal(animal));
    }

    private static String mes(int numero) {
            switch (numero) {
                case 1:
                    return "Janeiro";
                case 2:
                    return "Fevereiro";
                case 3:
                    return "Março";
                case 4:
                    return "Abril";
                case 5:
                    return "Maio";
                case 6:
                    return "Junho";
                case 7:
                    return "Julho";
                case 8:
                    return "Agosto";
                case 9:
                    return "Setembro";
                case 10:
                    return "Outubro";
                case 11:
                    return "Novembro";
                case 12:
                    return "Dezembro";
                default:
                    return "Mês Inválido";
            }
    }

    private static String dia(int numero){
        switch (numero) {
            case 0:
                return "Domingo";
            case 1:
                return "Segunda-Feira";
            case 2:
                return "Terça-Feira";
            case 3:
                return "Quarta-Feira";
            case 4:
                return "Quinta-Feira";
            case 5:
                return "Sexta-Feira";
            case 6:
                return "Sabado";

            default:
                return "Dia Inválido";
        }
    }

    private static String animal(int nome){
        switch (nome) {
            case 0:
                return "Cat";
            case 1:
                return "Dog";
            case 2:
                return "Snake";
            case 3:
                return "Bird";
            case 4:
                return "Cow";
            case 5:
                return "Chicken";
            case 6:
                return "Zebra";

            default:
                return "Animal Inválido";
        }
    }
}

