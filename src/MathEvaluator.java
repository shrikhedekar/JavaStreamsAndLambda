// This class gives demo of functional interfaces
@FunctionalInterface
interface MathFunction {
    double evaluate(double x);
}

public class MathEvaluator {

    public static void main(String [] args) {
        MathFunction f = x->2.0 * x + 1.0;
        double y = f.evaluate(3.0);
        System.out.println("Evaluation output : "+y);
    }

}
