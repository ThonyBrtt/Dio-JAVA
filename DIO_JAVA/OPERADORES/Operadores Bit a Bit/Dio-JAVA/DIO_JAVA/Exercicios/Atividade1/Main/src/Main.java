import java.util.Scanner;
// Ativdade simples para descobrir a idade do usuario conforme o seu ano de nascimento
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = input.nextLine();
        System.out.println("Qual o seu ano de nascimento?");
        int nasc = input.nextInt();

        var idade = 2025 - nasc;

        System.out.printf("Olá %s, sua idade é %s\n", nome, idade);

    }
}