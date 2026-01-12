public class CarMain {

    static {
        System.out.println("Static block executing from same block");
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("Main method invocation started...");
        Car car1 = new Car();
        Car car2 = new Car("Corolla", "Red", 150);
        /*System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.horsePower);*/
        // System.out.println(Car.NO_OF_WHEELS);
        // Car.NO_OF_WHEELS = 6;
        // System.out.println(Car.NO_OF_WHEELS);
        System.out.println(Car.noOfEngines);
    }
}
