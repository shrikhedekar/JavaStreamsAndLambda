import java.util.List;

public class PrintNames {

    public static void main(String [] args) {
        var names =  List.of("Susan","John","Michel", "Mitchell");

        // Following using a lambda
        names.forEach(name -> System.out.println(name));

        // Following using a method references
        names.forEach(System.out::println);

    }
}
