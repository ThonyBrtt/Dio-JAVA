public class Main {
    /*Escreva um código que calcule o valor de tributos de produtos,
    os produtos disponíveis devem ser dos seguintes tipos: Alimentação,
    Saude e bem estar, Vestuário e Cultura. Todos os produtos devem er um
    método para retornar o seu valor de imposto, de acordo com seu tipo:

        Alimentação 1%;
        Saude e bem estar 1.5%;
        Vestuário 2.5%;
        Cultura 4%.*/
    public static void main(String[] args)  {
        Product[] buyProduct = {
                new Food("Feijão", 25.00),
                new Health("Rexona", 8.00),
                new Clothing("Calcinha", 50.00),
                new Culture("Livro de Java", 90.00)
        };
        for (Product p : buyProduct){
            System.out.println("Produto: " + p.name + " | Preço Original: R$" + p.preco + " | Imposto: R$ " + String.format("%.2f",p.calcularImposto()));
        }

    }
}
