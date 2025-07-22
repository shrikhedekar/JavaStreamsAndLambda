import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

// This class demos the different types of method references

public class PrintNames {

    public static void main(String [] args) {
       // var names =  List.of("Susan","John","Michel", "Mitchell");
        List<String> names = new ArrayList<>(Arrays.asList("Susan","John","Michel", "Mitchell"));

        // Following using a lambda
        names.forEach(name -> System.out.println(name));

        // Following using a method references
        names.forEach(System.out::println);

        // We have 4 types of method references

        // Method references to a static method
        names.sort(PrintNames::compareByLength);

        // Method references to an instance method for a specific object
        names.forEach(System.out::println);

        // Method references to an instance method to be called for the first argument
        Function<String, String> transformer = String::toUpperCase;
        System.out.println(transformer.apply("Susan"));

        // Method reference to a constructor
        Supplier<List<String>> listFactory = ArrayList::new;
        var list = listFactory.get();
        list.add("Shrirang");
        list.add("Mahesh");
        list.forEach(System.out::println);

    }

    static int compareByLength(String s1, String s2) {
        return s1.length() - s2.length();
    }

}
