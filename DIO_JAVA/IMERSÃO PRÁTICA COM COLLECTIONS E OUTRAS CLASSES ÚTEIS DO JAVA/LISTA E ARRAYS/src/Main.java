import java.awt.desktop.OpenFilesEvent;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        int[] codes = { 789, 852 };
        System.out.println(codes.length);
        System.out.println(codes[0]);
        System.out.println(codes[1]);
        List<Integer> codes2 = new ArrayList<>();
        codes2.add(codes[0]);
        codes2.add(codes[1]);
        codes2.forEach(System.out::println);
        codes2.add(74899);
        codes2.forEach(System.out::println);

        List<User> users = new ArrayList<>();
        var user = new User(1, "Anthony");
        users.add(user);
        users.add(new User(2, "Lara"));
        users.add(new User(3, "Sabryna"));
        System.out.println(users);
        System.out.println(users.remove(new User(8,"Sabryna")));
        System.out.println(users.remove(1));
        System.out.println(users);
        users.clear();
        System.out.println(users);

        List<Integer> arrayList = new ArrayList<>();
        var arrayStart = OffsetDateTime.now();
        for (int i = 0; i < 100_00_00; i++) {
            arrayList.add(i);
        }

        System.out.println(Duration.between(arrayStart, OffsetDateTime.now()).toMillis());

        var vectorStart = OffsetDateTime.now();
        List<Integer> vector = new Vector<>();
        for (int i = 0; i < 100_00_00; i++) {
            vector.add(i);
        }
        System.out.println(Duration.between(vectorStart, OffsetDateTime.now()).toMillis());
    }
}