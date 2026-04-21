 class Culture extends Product{
     public Culture(String name, double preco){
         super(name,preco);
     }
     @Override
     public double calcularImposto(){
         return this.preco * 0.04;
     }
}
