public class Main {
    public static void main(String[] args) {
        int a = 6;   // 110 em binário
        int b = 4;   // 100 em binário

        System.out.println("a = " + a + " (binário: 110)");
        System.out.println("b = " + b + " (binário: 100)");

        System.out.println("\n--- Operadores Bit a Bit ---");
        System.out.println("a & b (AND) = " + (a & b));   // 100 (4)
        System.out.println("a | b (OR) = " + (a | b));    // 110 (6)
        System.out.println("a ^ b (XOR) = " + (a ^ b));   // 010 (2)
        System.out.println("~a (NOT) = " + (~a));         // inverte todos os bits

        System.out.println("\n--- Deslocamento de Bits ---");
        System.out.println("a << 1 (desloca à esquerda) = " + (a << 1)); // 1100 (12)
        System.out.println("a >> 1 (desloca à direita) = " + (a >> 1));  // 11 (3)
        System.out.println("a >>> 1 (desloca à direita com zero-fill) = " + (a >>> 1)); // 3
    }
}
