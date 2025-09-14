public class Main {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("x: " + x);      // 5
        System.out.println("x++: " + (x++)); // 5 (usa o valor, depois incrementa)
        System.out.println("Após x++: " + x); // 6
        System.out.println("++x: " + (++x)); // 7 (incrementa antes de usar)
        System.out.println("x--: " + (x--)); // 7 (usa o valor, depois decrementa)
        System.out.println("Após x--: " + x); // 6
        System.out.println("--x: " + (--x)); // 5
    }
}
