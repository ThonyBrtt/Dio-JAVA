import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== MENU =====");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        double resultado;

        switch (opcao) {
            case 1:
                resultado = n1 + n2;
                System.out.println("Resultado da soma: " + resultado);
                break;

            case 2:
                resultado = n1 - n2;
                System.out.println("Resultado da subtração: " + resultado);
                break;

            case 3:
                resultado = n1 * n2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;

            case 4:
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida!");
                }
                break;

            case 5:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
