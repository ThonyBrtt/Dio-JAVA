import java.util.Scanner;

/*Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolha
entre a opção par e ímpar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
o intervalo de números informados, incluindo os números informados e em ordem decrescente.*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int num2 = scanner.nextInt();

        System.out.print("Você quer pares ou ímpares? (digite par ou impar): ");
        var opcao = scanner.next().charAt(0);

        System.out.println("\nNúmeros selecionados:");

        for (int i = num2; i >= num1; i--) {
            if (opcao == 'p' && i % 2 == 0) {
                System.out.print(i + " ");
            } else if (opcao == 'i' && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
