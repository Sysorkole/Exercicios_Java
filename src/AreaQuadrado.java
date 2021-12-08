import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a base: ");
        int base = entrada.nextInt();
        System.out.println("Informe a altura: ");
        int altura = entrada.nextInt();
        System.out.printf("Área: %d cm", (base*altura));
        if(base == altura){
            System.out.println(",e é um quadrado!!!");
        }else{
            System.out.println(", mas não é um quadrado...");
        }
    }
}
