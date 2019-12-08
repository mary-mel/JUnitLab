public class Calculator {
    public double add(double a, double b) {
        return add2Numbers(a, b);
    }

    private double add2Numbers(double x, double y) {
        return x + y;
    }

    public double subtract(double a, double b) {
        return a - b;
    }
    
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }

    public double[] getArrayFromValues(double a, double b){
        return new double[] {a, b};
    }

}
