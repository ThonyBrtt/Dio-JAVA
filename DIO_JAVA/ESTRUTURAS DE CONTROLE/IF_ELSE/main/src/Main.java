import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
       var scanner = new Scanner(System.in);
       System.out.println("Informe seu nome:");
       var name = scanner.next();
       System.out.println("Informe sua idade:");
       var age = scanner.nextInt();
       System.out.println("Vc é emancipado? (s/n)");
       var isEmancipated = scanner.next().equalsIgnoreCase("s");

       if (age >= 18){
           System.out.printf("%s vc tem %s anos, entao pode dirigir",name,age);

       } else if (age >= 16 && isEmancipated){
           System.out.printf("%s vc tem %s e é Emancipato, logo vc pode dirigir",name,age);
       }else{
           System.out.printf("%s vc tem %s e pode dirigir ",name,age);
       }


    }
}