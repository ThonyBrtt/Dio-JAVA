public class Main {
    public static void main(String[] args) {
        int n = 10;

        n += 5;  // n = n + 5 → 15
        System.out.println("n += 5 → " + n);

        n -= 3;  // n = n - 3 → 12
        System.out.println("n -= 3 → " + n);

        n *= 2;  // n = n * 2 → 24
        System.out.println("n *= 2 → " + n);

        n /= 4;  // n = n / 4 → 6
        System.out.println("n /= 4 → " + n);

        n %= 5;  // n = n % 5 → 1
        System.out.println("n %= 5 → " + n);
    }
}
