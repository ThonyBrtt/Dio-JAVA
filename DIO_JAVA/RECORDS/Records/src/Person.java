import com.sun.nio.sctp.AbstractNotificationHandler;

public record Person(String name, int age) {

    public  Person{

    }

    public Person(String name){
        this(name,12);
    }

    public String getInfo(){
        return  "Name: " + name + " Age: " + age;
    }
}
