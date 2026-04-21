 class Health extends Product {
     public Health(String name, double preco){
         super(name,preco);
     }
     @Override
     public double calcularImposto(){
         return this.preco * 0.015;
     }
}
