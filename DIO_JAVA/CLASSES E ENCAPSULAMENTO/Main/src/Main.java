import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var male = new Person("Anthony");
        male.intAge();
        var woman = new Person("Lara");
        woman.intAge();

        System.out.println("Male name: " + male.getName() + " age " + male.getAge());
        System.out.println("Woman name: " + woman.getName() + " age " + woman.getAge());
    }
}
