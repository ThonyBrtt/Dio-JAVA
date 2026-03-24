import java.util.Scanner;
// Atividade 2 - Digite o nome, peso e altura do usuario e calcule o seu imc
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:  ");
        var name = scanner.nextLine();
        System.out.println("Infrome sua altura");
        double altura = scanner.nextDouble();
        System.out.println("Informe seu peso");
        double peso = scanner.nextDouble();
        scanner.close();

        double imc = peso/(altura*altura);

        System.out.println("----------------");
        System.out.println("SEU IMC É DE: " + imc);
        System.out.println("----------------");
        if (imc <= 18.5){
            System.out.println("ABAIXO DO PESO");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("PESO IDEAL");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("LEVEMENTE ACIMA DO PESO");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("OBESIDADE GRAU I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("OBESIDADE GRAU II");
        }else{
            System.out.println("OBESIDADE GRAU III");
        }

    }
}