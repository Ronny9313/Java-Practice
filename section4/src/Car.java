public class Car {
    String model;
    String color;
    int horsePower;
    static final byte NO_OF_WHEELS = 4;
    static byte noOfEngines;

    static {
        noOfEngines = 1;
        System.out.println("Static block is being executed");
    }

    // Instance initializer block gets executed before constructor (IIB)
    {
        this.model = "Camry";
        this.color = "Blue";
        this.horsePower = 200;
        System.out.println("Car object getting created");
    }

    public Car() {
        // this("Camry", "Blue", 200);
        System.out.println(NO_OF_WHEELS);
        System.out.println("Car object getting created in no-args constructor");
    }

    public Car(String model, String color, int horsePower) {
        System.out.println("Car object getting created in parameterized constructor");
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public void startCar() {
        System.out.println("Car is starting");
    }

    public void stopCar() {
        System.out.println("Car is stopping");
    }
}
