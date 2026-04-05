package domain;

// 'sealed' restringe a herança. 'permits' diz que apenas Menager e Salesman podem ser filhos.
public sealed abstract class Employee permits Menager, Salesman {

    protected String code;    // 'protected' permite que as classes filhas acessem diretamente
    protected String name;
    protected String address;
    protected int age;
    private double salary;    // 'private' protege o dado; acesso só via getter/setter

    // Construtor completo para inicializar todos os atributos de uma vez
    public Employee(String code, String name, String address, int age, double salary) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    // Construtor vazio (necessário se você quiser instanciar sem passar dados no início)
    public Employee() {
    }

    // Métodos Getter e Setter (Encapsulamento)
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // MÉTODO ABSTRATO: Cada filho (Salesman/Menager) DEVE implementar sua própria regra de cálculo
    public abstract double getFullSalary();

    // SOBRECARGA DE MÉTODO (Overload): Mesmo nome, mas parâmetros diferentes
    public double getFullSalary(Double extra) {
        return this.getFullSalary() + extra; // Soma o salário calculado com um bônus fixo
    }

    // Outro exemplo de sobrecarga (atualmente retorna 0)
    public double getFullSalary(double extra, double extra2) {
        return 0;
    }

    // Getters e Setters restantes...
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}