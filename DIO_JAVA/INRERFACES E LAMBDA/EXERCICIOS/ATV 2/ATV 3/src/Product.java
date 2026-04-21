abstract class Product {
    protected String name;
    protected double preco;

    public Product(String name,double preco){
        this.name = name;
        this.preco = preco;
    }
    public abstract double calcularImposto();

}
