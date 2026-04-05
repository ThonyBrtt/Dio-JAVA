package domain;

// 'non-sealed' é obrigatório aqui porque a classe pai (Employee) é 'sealed'.
// Isso indica que a árvore de herança pode continuar aberta a partir desta classe.
public non-sealed class Menager extends Employee {

    // Atributos específicos do Gerente (Encapsulados como private)
    private String login;
    private String password;
    private double conmission; // (Dica: O termo correto em inglês seria 'commission')

    // Construtor Completo: Recebe os dados dele e os dados que pertencem ao pai (Employee)
    public Menager(String code, String name, String login, String password, String address, int age, double salary, double conmission) {
        // 'super' chama o construtor da classe pai para inicializar code, name, address, age e salary
        super(code, name, address, age, salary);
        this.login = login;
        this.password = password;
        this.conmission = conmission;
    }

    // Sobrescrita do método getCode:
    // Diferente do vendedor (SL), o gerente ganha o prefixo "MM" no código.
    @Override
    public String getCode() {
        return "MM" + this.code;
    }

    // Implementação obrigatória do método abstrato definido no pai.
    // Regra de Salário do Gerente: Salário base + valor fixo de comissão.
    @Override
    public double getFullSalary() {
        return this.getSalary() + this.conmission;
    }

    // Construtor vazio: permite criar o objeto e preencher os dados depois via Setters.
    public Menager() {
    }

    // --- Getters e Setters (Encapsulamento) ---

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getConmission() {
        return conmission;
    }

    public void setConmission(double conmission) {
        this.conmission = conmission;
    }
}