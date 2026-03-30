import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enquanto o Scanner encontrar uma nova linha no teste...
        while (scanner.hasNextLine()) {

            // 1. Pega a linha da vez (não importa se é a 1ª ou a 100ª)
            String projeto = scanner.nextLine();

            // 2. Se o teste mandou uma linha vazia no final, a gente ignora
            if (projeto.isEmpty()) continue;

            // 3. Processa e já cospe o resultado na tela
            System.out.println(projeto.toUpperCase() + " " + projeto.length());

            // O loop volta lá pro topo pra ver se tem mais!
        }

        scanner.close();
    }
}