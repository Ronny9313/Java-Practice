public class Employee {
    String firstName;
    String lastName;
    byte age;
    char gender;
    static final String EMPLOYER_NAME = "Google";

    public Employee() {
        /*this.firstName = "John";
        this.lastName = "Doe";
        this.age = 30;
        this.gender = 'M';*/
        // this(); // Recursive constructor call
        // this("Will", "Smith", (byte) 55, 'M'); // Only one explicit constructor call allowed in constructor
        this("Will", "Smith", (byte) 55, 'M');
        System.out.println("Object getting created in Default / no-args constructor");
    }

    public Employee(String firstName, String lastName, byte age, char gender) {
        System.out.println("Object getting created in Parameterized constructor");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Employee(String firstName, String lastName, byte age) {
        System.out.println("Object getting created in Parameterized constructor");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
