import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>((User u1, User u2) -> {
            var compareResult = 0;
            if (u1.getId() > u2.getId()) compareResult ++;
            if (u1.getId() < u2.getId()) compareResult --;
            return compareResult;
        });
        users.add(new User(1, "Anthony"));
        users.add(new User(2, "Lara"));
        users.add(new User(3, "Mateus"));
        users.add(new User(4, "Sabryna"));

        System.out.println(users);
    }
}
