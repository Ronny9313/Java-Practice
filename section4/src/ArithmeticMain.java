public class ArithmeticMain {
    public static void main(String[] args) {
        int resultFromStaticMethod = ArithmeticOperations.addition(30, 20);
        System.out.println("Result from static method addition: " + resultFromStaticMethod);
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        int resultFromInstanceMethod = arithmeticOperations.sum(30, 70);
        System.out.println("Result from instance method sum: " + resultFromInstanceMethod);
        System.out.println("Instance variable piValue: " + arithmeticOperations.piValue);
        System.out.println("Static variable PI_VALUE: " + ArithmeticOperations.PI_VALUE);
    }
}
