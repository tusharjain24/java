package lambdaexpression;

/*
1. Lambda expression only works with Functional Interface
2. Lambda Expression provide the body of abstract method
3. (parameters) -> {method body}

*/

@FunctionalInterface
interface Vehicle {
    // public void start(String name);
    public int average(int distance, int fuelConsumed);
}

public class LambdaExpression {
    public static void main(String[] args) {
        // Implementation of the abstract method of the interface using lambda
        // expression
        Vehicle bike = (distance, fuelConsumed) -> distance / fuelConsumed;
        System.out.println(bike.average(100, 4));
    }

}
