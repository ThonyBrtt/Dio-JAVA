import domain.Employee;
import domain.Menager;
import domain.Salesman;

public class Main {

    public static void main(String[] args) {
        // Polimorfismo: Uma variável do tipo Employee guardando um objeto do tipo Menager
        Employee menager = new Menager();

        PrintEmployee(new Menager());  // Testa com gerente
        PrintEmployee(new Salesman()); // Testa com vendedor
    }

    public static void PrintEmployee(Employee employee) {
        // PATTERN MATCHING (Java 17+): Já verifica o tipo e cria uma variável local 'castada'
        switch (employee) {
            case Menager menager -> {
                // Aqui dentro, 'menager' já é tratado como a classe Menager, não como Employee
                menager.setCode("123");
                menager.setName("Joao");
                menager.setSalary(5000);
                menager.setLogin("joao");
                menager.setPassword("123456");
                menager.setConmission(1200);

                System.out.println("Código: " + menager.getCode());
                System.out.println("Login: " + menager.getLogin());
                // ... (outros prints)
            }
            case Salesman salesman -> {
                // Aqui dentro, 'salesman' já é do tipo Salesman
                salesman.setCode("456");
                salesman.setName("Lucas");
                salesman.setSalary(2800);
                salesman.setPercentPetSold(10);
                salesman.setSoldAmount(1000);

                System.out.println("Código: " + salesman.getCode());
                System.out.println("Vendas: " + salesman.getSoldAmount());
            }
        }

        // Chamada polimórfica: Não importa se é gerente ou vendedor,
        // o Java sabe qual getFullSalary() chamar em tempo de execução.
        System.out.println("Salário Total (+ bônus 500): " + employee.getFullSalary(500.0));
        System.out.println("Salário Base Calculado: " + employee.getFullSalary());
        System.out.println("==================");
    }
}