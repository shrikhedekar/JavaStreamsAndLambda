import java.util.List;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to the demo on Streams and Lambda!");
        var names =  List.of("Susan","John","Michel", "Mitchell");

        // Traversing list conventional way
        for (String name : names) {
            System.out.println("Names using for : " + name);
        }

        // Traversing list using anonyms class to define the required functional interface
        names.forEach(new Consumer<>() {
            @Override
            public void accept(String name) {
                System.out.println("Names using Anonymous class : "+name);
            }
        });

        // Using a lambda with reduced code following its syntax
        names.forEach(name ->System.out.println("Names using Lambda : "+name));

        // Defining lambda
        Consumer <String> print = name -> System.out.println("Names using Lambda : "+name);
        names.forEach(print);


        // using local variables in lambda expressions
        var message = "Hello ";
        names.forEach(name ->System.out.println(message+name));



    }
}