package com.eazybytes.app;

//import com.eazybytes.model.Employee;
//import com.eazybytes.model.Vehicle;

import com.eazybytes.model.Class1;
// import com.eazybytes.service.Class1;
import com.eazybytes.model.Employee;
import com.eazybytes.model.Person;
import com.eazybytes.model.Vehicle;
import com.eazybytes.service.VehicleService;

import java.util.Arrays;

import static com.eazybytes.utility.MyConstants.*;
import static java.lang.Math.PI;

public class MainClass {
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService();
        Vehicle vehicle = new Vehicle();
        Employee employee = new Employee("John Doe");
        System.out.println(employee.employeeName);
        String input = new String("Hello World");
        System.out.println(input);
        int[] numbers = new int[]{5, 2, 3, 4, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // System.out.println(MyConstants.TAX_RATE);
        // System.out.println(MyConstants.SHIPPING_COST);

        System.out.println(TAX_RATE);
        System.out.println(SHIPPING_COST);
        // System.out.println(MyConstants.calculateTotalCost(9.99));
        System.out.println(calculateTotalCost(9.99));
        System.out.println(PI);

        Class1 model = new Class1();
        com.eazybytes.service.Class1 service = new com.eazybytes.service.Class1();

        MyOuterClass.MyInnerClass myInnerClass = new MyOuterClass.MyInnerClass();
        myInnerClass.display();

        AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo();
        accessModifiersDemo.publicMethod();
        accessModifiersDemo.protectedMethod();
        accessModifiersDemo.defaultMethod();
        // accessModifiersDemo.privateMethod();

        Person person = new Person();
        // person.firstName = "John";
        // person.lastName = "Doe";
        // person.age = 30;
        // person.salary = 5000.0;
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(30);
        person.setSalary(5000.0);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.getSalary());

    }
}
