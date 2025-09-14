import java.util.Scanner;
// Atividade 2 - Digite o nome, peso e altura do usuario e calcule o seu imc
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso/(altura*altura);
        System.out.println("-------------------------");
        System.out.printf("Resultado: %s\n", imc);
        System.out.println("-------------------------");
        if (imc <= 18.5) {
            System.out.printf("Olá %s. Você está abaixo do peso", nome);
        }else if (imc >= 18.6 && imc <= 24.9) {
            System.out.printf("Olá %s. Você está no peso ideal", nome);
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.printf("Olá %s. Você está levente acima do peso", nome);
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.printf("Olá %s. Você está Grau de obesidade I", nome);
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.printf("Olá %s. Você está Grau de obesidade II (Severa)", nome);
        }else if (imc >= 40) {
            System.out.printf("Olá %s. Você está no Grau de obesidade III (Mórbida", nome);
        }
        scanner.close();
    }
}