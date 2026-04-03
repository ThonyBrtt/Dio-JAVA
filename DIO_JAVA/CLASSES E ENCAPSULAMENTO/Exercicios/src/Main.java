import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        var option = -1;

        do {
            System.out.println(" ESCOLHA UMAS DAS OPCOES");
            System.out.println("-----------------------");
            System.out.println(" 1 -  BANHO NO PET");
            System.out.println(" 2 - ABASTERCER A MAQUINA COM AGUA");
            System.out.println(" 3 - ABASTECER A MAQUINA COM SHAMPOO");
            System.out.println(" 4 - VERIFICAR AGUA DA MAQUINA");
            System.out.println(" 5 - VERIFICAR SHAMPOO DA MAQUINA");
            System.out.println(" 6 - VERIFICAR SE TEM PET NO BANHO");
            System.out.println(" 7 - COLOCAR PET NA MAQUINA ");
            ;
            System.out.println(" 8 - RETIRAR PET DA MAQUINA ");
            System.out.println(" 9 - LIMPAR A MAQUINA ");
            System.out.println(" 0 - SAIR ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> addWater();
                case 3 -> addShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opcao invalidaaaa");
            }


        } while (true);
    }
    private static void addWater(){
        System.out.println("Tentando colocar agua na maquina");
        petMachine.addWater();
    }

    public static void addShampoo(){
        System.out.println("Tentando colocar shampoo na maquina ");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A maquina está no comomento com " + amount + "Litros de agua");
    }

    private static void checkIfHasPetInMachine() {
        var hesPet = petMachine.hesPet();
        System.out.println(hesPet ? "Tem pet na maquina" : "Nao tem pet na maquina");

    }

    public static void setPetPetInMachine() {
        scanner.nextLine();
        var name = "";

        // Agora o loop funciona porque name está realmente vazio
        while (name == null || name.strip().isEmpty()) {
            System.out.println("Informe o nome do pet:");
            name = scanner.nextLine();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O PET " + pet.getName() + " FOI COLOCADO NA MAQUINA");
    }

    public void getPetFromMachine() {
    }

    public static void verifyShampoo(){
        var amount = petMachine.getShampoo();
        System.out.println("A maquina está no comomento com " + amount + "Litros de shampoo");
    }
}