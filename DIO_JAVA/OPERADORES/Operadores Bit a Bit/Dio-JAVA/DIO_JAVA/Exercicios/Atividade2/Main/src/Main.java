import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // atividade simples para calcular a area de um quadrado
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor do altura do quadrado?");
        double altura = input.nextDouble();
        System.out.println("Qual o valor da largaura do quadrado?");
        double largura = input.nextDouble();

        var area = altura * largura;
        System.out.printf("A area do quadrado é %s\n", area);
    }
}
