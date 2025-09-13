import java.util.function.Function;

interface Shape {
    void draw();
}
class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle using conventional overridden method");
    }
}

public class FunctionalInterfaceDemo {

    public static void main(String [] args) {
        // Traditional declaration
        Circle c1 = new Circle();
        c1.draw();

        // Functional programming with Lambda expression
        Shape c2 = ()->System.out.println("Drawing circle using function interface instance created using " +
                "lambda expression");

        c2.draw();

        // Using method reference to implement functional interface
        Function<String , String> upperCase = String::toUpperCase;

        System.out.println("Using method reference :"+upperCase.apply("this was passed as lowercase"));
    }

}
