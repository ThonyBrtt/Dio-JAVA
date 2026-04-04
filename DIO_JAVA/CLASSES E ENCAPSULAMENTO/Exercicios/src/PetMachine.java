public class PetMachine {

    // Indica se a máquina está limpa. Curiosidade: boolean começa como 'false' por padrão!
    private boolean clean;

    // A máquina começa com 30 litros de água.
    private int water = 30;

    // A máquina começa com 10 litros de shampoo.
    private int shampoo = 10;

    // Guarda o Pet que está atualmente DENTRO da máquina (se houver um).
    private Pet pet;

    // Função que dá o banho no pet
    public void takeAShower() {
        // Se não tiver nenhum pet dentro da máquina, avisa e para a função aqui (return).
        if (this.pet == null) {
            System.out.println("Pode colocar o pet na maquina para iniciar o banho");
            return;
        }
        // Se tinha pet, gasta 10 de água e 2 de shampoo.
        this.water -= 10;
        this.shampoo -= 2;

        // Altera o estado do pet lá na classe Pet para 'true' (limpo).
        pet.setClean(true);
        System.out.println("O pet está limpo");
    }

    // Função para colocar mais água na máquina
    public void addWater() {
        // Se já estiver no limite máximo (30), não deixa colocar mais.
        if (water == 30) {
            System.out.println("A capacidade de agua está mo maximo");
            return;
        }
        // Se couber, adiciona 2 litros.
        water += 2;
    }

    // Função para colocar mais shampoo na máquina
    public void addShampoo() {
        // Se já estiver no limite máximo (10), não deixa colocar mais.
        if (shampoo == 10) {
            System.out.println("A capacidade de Shampoo está mo maximo");
            return;
        }
        // Se couber, adiciona 2 litros.
        shampoo += 2;
    }

    // Retorna a quantidade atual de água para a classe Main poder mostrar.
    public int getWater() {
        return water;
    }

    // Retorna a quantidade atual de shampoo para a classe Main poder mostrar.
    public int getShampoo() {
        return shampoo;
    }

    // Verifica se tem algum pet na máquina (se for diferente de null, tem pet).
    public boolean hesPet() {
        return pet != null;
    }

    // Função para botar o Pet dentro da máquina
    public void setPet(Pet pet) {
        // Se a máquina NÃO estiver limpa (!clean), impede de colocar o pet.
        if (!this.clean) {
            System.out.println("A maquina está suja! Limpe-a antes.");
            return;
        }
        // Se já tiver outro pet lá dentro, impede de colocar um novo.
        if (hesPet()) {
            System.out.println("O pet " + this.pet.getName() + " já está na máquina.");
            return;
        }
        // Se passou pelos testes acima, a máquina recebe o pet!
        this.pet = pet;
    }

    // Função para tirar o pet da máquina
    public void removePet() {
        // A máquina absorve o estado de limpeza do pet (se o pet sai limpo, a máquina fica limpa).
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi retirado da maquina");
        // Esvazia a variável 'pet' (máquina agora está vazia).
        this.pet = null;
    }

    // Função para lavar a própria máquina
    public void wash() {
        // Lavar a máquina também gasta recursos: 10 de água e 2 de shampoo.
        this.water -= 10;
        this.shampoo -= 2;
        // Agora o estado dela passa a ser limpa (true).
        this.clean = true;
        System.out.println("A maquina está limpa");
    }
}