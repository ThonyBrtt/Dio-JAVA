public class PetMachine {

    private boolean clean;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;


    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Pode colocar o pet na maquina para iniciar o banho");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet está limpo");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade de agua está mo maximo");
            return;

        }
        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de Shampoo está mo maximo");
            return;

        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hesPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A maquina está suja! Limpe-a antes.");
            return;
        }
        if (hesPet()){
            System.out.println("O pet " + this.pet.getName() + " já está na máquina.");
            return;
        }
        this.pet = pet;
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + "foi retirado da maquina" );
        this.pet = null;


    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina está limpa");
    }
}

