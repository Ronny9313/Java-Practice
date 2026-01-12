public class ArithmeticOperations {

    double piValue = 3.14;
    static final double PI_VALUE = 3.14;

    public static void main(String[] args) {
        int result = addition(20, 5);
        System.out.println(result);
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        int result2 = arithmeticOperations.sum(20, 5);
        System.out.println(result2);
        System.out.println(arithmeticOperations.piValue);
        System.out.println(PI_VALUE);
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2) {
        System.out.println("Instance variable piValue: " + piValue);
        System.out.println("Static variable PI_VALUE: " + PI_VALUE);
        System.out.println("Subtraction result: " + subtract(num1, num2));
        System.out.println("Addition result: " + addition(num1, num2));
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
}
