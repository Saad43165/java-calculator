public class Calculator {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
    public static double modulus(double a, double b) { return a % b; }
    public static double exponentiation(double base, double exponent) { return Math.pow(base, exponent); }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(10, 5));
        System.out.println("Subtraction: " + subtract(10, 5));
        System.out.println("Multiplication: " + multiply(10, 5));
        System.out.println("Division: " + divide(10, 5));
        System.out.println("Modulus: " + modulus(10, 3));
        System.out.println("Exponentiation: " + exponentiation(2, 3));
    }
}

