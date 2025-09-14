import java.util.Scanner;
// Atividade para calcular a area de um retangulo
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.printf("A área do retângulo é %s \n",area);

        scanner.close();
    }
}
