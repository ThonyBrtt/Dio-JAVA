import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        while(!name.equals("exit")){
            System.out.println("Informe um nome");
            name = scanner.nextLine();
            System.out.println(name);
        }
    }
}