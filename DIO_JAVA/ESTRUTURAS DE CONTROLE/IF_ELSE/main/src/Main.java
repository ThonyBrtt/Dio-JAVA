import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
       var scanner = new Scanner(System.in);
       System.out.println("Informe seu nome");
       var name = scanner.nextLine();
       System.out.println("Informe seu idade");
       var age = scanner.nextInt();
       System.out.println("voce é emancipado?");
       var isEmancipated = scanner.next().equalsIgnoreCase("s");

        boolean isEmancipated1 = isEmancipated;
        if (age >= 18) {
            System.out.printf("%s tem %s anos, voce pode dirigir \n", name, age);
        } else if (age >=16 && isEmancipated) {
            System.out.printf("%s mesmo com %s, voce pode dirigir sendo emancipado \n", name, age);
    }else{
            System.out.printf("%s tem %d anos, voce nao pode dirigir \n", name, age);
        }

        System.out.println("Fim da execução");

    }
}