

public class Main {
    public static void main (String[] args){

        for (var i = 0; i <= 100; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }


    }
}