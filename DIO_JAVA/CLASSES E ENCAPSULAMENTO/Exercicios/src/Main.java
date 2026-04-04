import java.util.Scanner;

public class Main {
    // Objeto para ler o que você digita no teclado.
    private final static Scanner scanner = new Scanner(System.in);

    // Cria a nossa máquina de pet física na memória para podermos usar.
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        // Variável que guarda a opção que você digitou no menu.
        var option = -1;

        // O 'do-while' garante que o menu vai rodar pelo menos uma vez e continuar rodando.
        do {
            // Exibição visual do Menu no terminal
            System.out.println(" ESCOLHA UMAS DAS OPCOES");
            System.out.println("-----------------------");
            System.out.println(" 1 -  BANHO NO PET");
            System.out.println(" 2 - ABASTERCER A MAQUINA COM AGUA");
            System.out.println(" 3 - ABASTECER A MAQUINA COM SHAMPOO");
            System.out.println(" 4 - VERIFICAR AGUA DA MAQUINA");
            System.out.println(" 5 - VERIFICAR SHAMPOO DA MAQUINA");
            System.out.println(" 6 - VERIFICAR SE TEM PET NO BANHO");
            System.out.println(" 7 - COLOCAR PET NA MAQUINA ");
            System.out.println(" 8 - RETIRAR PET DA MAQUINA ");
            System.out.println(" 9 - LIMPAR A MAQUINA ");
            System.out.println(" 0 - SAIR ");

            // Lê o número que você digitou.
            option = scanner.nextInt();

            // O switch direciona para a função correta baseado no número digitado.
            switch (option) {
                case 1 -> petMachine.takeAShower(); // Chama direto o método da máquina
                case 2 -> addWater();               // Chama o método auxiliar aqui embaixo
                case 3 -> addShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);          // Fecha o programa Java completamente.
                default -> System.out.println("Opcao invalidaaaa"); // Se digitar 55, por exemplo.
            }

        } while (true); // O loop é infinito (true), só para se cair no System.exit(0).
    }

    // Método auxiliar para adicionar água.
    private static void addWater() {
        System.out.println("Tentando colocar agua na maquina");
        petMachine.addWater(); // Aciona a inteligência lá da PetMachine.
    }

    // Método auxiliar para adicionar shampoo.
    public static void addShampoo() {
        System.out.println("Tentando colocar shampoo na maquina ");
        petMachine.addShampoo();
    }

    // Pergunta para a máquina quanta água tem e mostra na tela.
    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A maquina está no momento com " + amount + " Litros de agua");
    }

    // Pergunta para a máquina se tem pet e usa um operador ternário para responder bonito.
    private static void checkIfHasPetInMachine() {
        var hesPet = petMachine.hesPet();
        System.out.println(hesPet ? "Tem pet na maquina" : "Nao tem pet na maquina");
    }

    // Método para interagir com o usuário e cadastrar o Pet.
    public static void setPetPetInMachine() {
        scanner.nextLine(); // Limpa o "Enter" fantasma do buffer do teclado.
        var name = "";

        // Enquanto o usuário não digitar um nome válido (não vazio), o loop insiste.
        while (name == null || name.strip().isEmpty()) {
            System.out.println("Informe o nome do pet:");
            name = scanner.nextLine(); // Lê a linha toda (aceita nomes com espaço).
        }

        // Cria o pet na memória e coloca ele dentro da máquina que criamos lá no topo.
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O PET " + pet.getName() + " FOI COLOCADO NA MAQUINA");
    }

    // Esse método não estava sendo usado no Switch, mas está aqui caso precise no futuro.
    public void getPetFromMachine() {
    }

    // Pergunta para a máquina quanto shampoo tem e mostra na tela.
    public static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A maquina está no momento com " + amount + " Litros de shampoo");
    }
}