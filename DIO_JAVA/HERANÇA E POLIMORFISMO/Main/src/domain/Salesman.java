package domain;

// 'non-sealed' é obrigatório porque a classe pai (Employee) é sealed
public non-sealed class Salesman extends Employee {

    private double percentPetSold; // Porcentagem de comissão
    private double soldAmount;     // Valor total vendido

    public Salesman(String code, String name, String address, int age, double salary, double soldAmount) {
        super(code, name, address, age, salary); // Chama o construtor da classe pai (Employee)
        this.percentPetSold = getPercentPetSold();
        this.soldAmount = soldAmount;
    }

    public Salesman() { }

    // SOBRESCRITA (Override): Muda o comportamento do método original do pai
    @Override
    public String getCode() {
        return "SL" + this.code; // Adiciona um prefixo "SL" para vendedores
    }

    // Implementação da regra de salário do vendedor: Salário base + comissão das vendas
    @Override
    public double getFullSalary() {
        return this.getSalary() + (soldAmount * percentPetSold) / 100;
    }

    // Getters e Setters específicos do vendedor...
    public double getPercentPetSold() { return percentPetSold; }
    public void setPercentPetSold(double percentPetSold) { this.percentPetSold = percentPetSold; }
    public double getSoldAmount() { return soldAmount; }
    public void setSoldAmount(double soldAmount) { this.soldAmount = soldAmount; }
}