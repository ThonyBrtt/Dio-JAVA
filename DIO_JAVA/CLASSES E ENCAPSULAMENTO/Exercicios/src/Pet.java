public class Pet {
    // Guarda o nome do pet. É 'final' porque o nome não muda depois de criado.
    private final String name;

    // Guarda se o pet está limpo (true) ou sujo (false).
    private boolean clean;

    // Construtor: É o que roda quando você faz 'new Pet("Nome")'
    public Pet(String name) {
        this.name = name;      // Salva o nome que você digitou.
        this.clean = false;    // Todo pet chega sujo na máquina por padrão.
    }

    // Método para descobrir o nome do pet.
    public String getName() {
        return name;
    }

    // Método para saber se o pet está limpo.
    public boolean isClean() {
        return clean;
    }

    // Método para mudar o estado de limpeza do pet (de sujo para limpo).
    public void setClean(boolean clean) {
        this.clean = clean;
    }
}