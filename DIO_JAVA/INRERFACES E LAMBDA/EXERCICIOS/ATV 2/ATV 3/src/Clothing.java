 class Clothing extends Product{
     public Clothing(String name, double preco){
         super(name,preco);
     }
     @Override
     public double calcularImposto(){
         return this.preco * 0.025;
     }
}
