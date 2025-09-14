import java.util.Scanner;
// Atividade 1 = Escreva um codigo onde o usuario entra com um numero e seja gerado a tabuada de 1 a 10 desse nuemro
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
       int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "x" + i +"="+(number * i) );
        }
        scanner.close();
    }
}