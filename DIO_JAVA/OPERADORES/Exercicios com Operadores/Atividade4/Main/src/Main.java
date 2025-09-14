import java.util.Scanner;

public class Main {
    // Atividade para calcular a diferença de idade de 2 pessoas
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primeira pessoa
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite a idade de " + nome1 + ": ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();

        // Segunda pessoa
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();

        System.out.print("Digite a idade de " + nome2 + ": ");
        int idade2 = scanner.nextInt();

        // Imprimir os dados
        System.out.println("\n=== Dados das Pessoas ===");
        System.out.println("Nome: " + nome1 + " | Idade: " + idade1);
        System.out.println("Nome: " + nome2 + " | Idade: " + idade2);

        // Diferença de idades
        int diferenca = Math.abs(idade1 - idade2);
        System.out.println("\nA diferença de idades entre " + nome1 + " e " + nome2 + " é: " + diferenca + " anos");

        scanner.close();
    }
}
