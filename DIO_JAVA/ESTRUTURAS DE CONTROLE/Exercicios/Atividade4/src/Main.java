import java.util.Scanner;

/*Escreva um codigo onde o usuario informa o numero incial, posteriomente ira informar outros N numeros,
a execução do codigo era continuar até que o numero informado divido pelo primeiro numero tenha resto diferente de 0 na divisao,
numeros menores que o primeiro numero dever ingnorados*/

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero: \n");
        var numero = scanner.nextInt();
        while (true) {
            System.out.println("Digite outro numero para verificação: \n");
            var toVerify = scanner.nextInt();
            if (toVerify < numero){
                System.out.printf("Informe um numero maior que %s\n",numero);
                continue;
            }
            var result = toVerify % numero;
            System.out.printf("%s %% %s = %s\n", toVerify, numero, result);
            if(result !=0)break;
        }
    }
}
