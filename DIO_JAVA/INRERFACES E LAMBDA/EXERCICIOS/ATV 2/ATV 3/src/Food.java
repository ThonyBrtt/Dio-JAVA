class Food extends Product {
    public Food(String name, double preco){
        super(name,preco);
    }
    @Override
    public double calcularImposto(){
        return this.preco * 0.01;
    }
}
