import java.util.Scanner;

public class DoWhile {
   public static void main(String[] args) {
       var scanner = new Scanner(System.in);
       var name = "";
       do {
           System.out.println("Informe um nome: ");
           name = scanner.nextLine();
           System.out.println(name);
       } while(!name.equalsIgnoreCase("exit"));
   }
}
