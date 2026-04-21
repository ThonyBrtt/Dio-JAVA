import java.util.Scanner;

public class Main {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int option;
        GeometricForm geometricForm = null;
        while (true){
            System.out.println("Escolha a forma geometrica");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Saida");
            option = scanner.nextInt();
            if (option == 1){
                geometricForm = createSquare();
            } else if (option == 2) {
                geometricForm = createRectangle();
            }else if (option == 3){
                geometricForm = createCircle();
            } else if (option == 4) {
                    break;
            }else{
                System.out.println("OPCAO INVALIDA");
                continue;
            }
            System.out.println("O RESULTADO DA AREA :  " + geometricForm.getArea());
        }
    }
    private static GeometricForm createSquare(){
        System.out.println("Informe o tamanho dos lados:");
        var side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle(){
        System.out.println("Informe a base:");
        var base = scanner.nextDouble();
        System.out.println("Informe a altura:");
        var height = scanner.nextDouble();
        return new Rectangle(height,base);
    }
    private static GeometricForm createCircle(){
        System.out.println("Informe o raio do circulo:");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
