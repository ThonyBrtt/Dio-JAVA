import keyword.Client;

public class Main {
    public static void main(String[] args){
        var user = new Client();
        user.setName("name");
        user.setStaticName("staticName");
        System.out.println(user.getName());
        System.out.println(user.getStaticName());
        System.out.println("--------------");
        var client2 = new Client();
        System.out.println(client2.getName());
        System.out.println(client2.getStaticName());
    }
}
