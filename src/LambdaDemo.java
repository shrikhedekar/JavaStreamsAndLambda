import java.util.function.Function;

interface addable {
    int add(int a,int b);
}


public class LambdaDemo {

    public static void main(String [] args) {

        System.out.println("Working with Lambda");

        addable a1 = (a,b) -> (a+b);

        System.out.println("Calling Lambda : "+a1.add(2,4));

        Function<Integer,Double> squareRootLambda = (n)->Math.sqrt(n);

        Function<Integer,Double> squareRootMethodRef = Math::sqrt;


        System.out.println("Calling functional interface :"+squareRootLambda.apply(9));
        System.out.println("Calling functional interface :"+squareRootMethodRef.apply(16));


    }

}
