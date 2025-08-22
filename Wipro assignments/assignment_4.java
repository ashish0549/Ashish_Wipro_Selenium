// Assignment 4 - Java Inheritance and Polymorphism Programs
// All programs compiled in one document

// ==================== PROGRAM 1: MULTILEVEL INHERITANCE ====================

// Vehicle.java
class Vehicle {
    String brand;
    int year;
    
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    void start() {
        System.out.println("Vehicle starting...");
    }
}

// Four_wheeler.java
class Four_wheeler extends Vehicle {
    int wheels = 4;
    
    Four_wheeler(String brand, int year) {
        super(brand, year);
    }
    
    void drive() {
        System.out.println("Four wheeler driving");
    }
}

// Petrol_Four_Wheeler.java
class Petrol_Four_Wheeler extends Four_wheeler {
    String fuelType = "Petrol";
    
    Petrol_Four_Wheeler(String brand, int year) {
        super(brand, year);
    }
    
    void refuel() {
        System.out.println("Refueling with petrol");
    }
}

// FiveSeater_Petrol_Four_Wheeler.java
class FiveSeater_Petrol_Four_Wheeler extends Petrol_Four_Wheeler {
    int seats = 5;
    
    FiveSeater_Petrol_Four_Wheeler(String brand, int year) {
        super(brand, year);
    }
    
    void showSeating() {
        System.out.println("This car has " + seats + " seats");
    }
}

// Baleno_FiveSeater_Petrol_Four_Wheeler.java
class Baleno_FiveSeater_Petrol_Four_Wheeler extends FiveSeater_Petrol_Four_Wheeler {
    String model = "Baleno";
    
    Baleno_FiveSeater_Petrol_Four_Wheeler(int year) {
        super("Maruti Suzuki", year);
    }
    
    void showDetails() {
        System.out.println("Car: " + brand + " " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Seats: " + seats);
    }
}

// ==================== PROGRAM 2: SUPER KEYWORD DEMONSTRATION ====================

class Animal {
    String name = "Animal";
    int age;
    
    Animal(int age) {
        this.age = age;
        System.out.println("Animal constructor called");
    }
    
    void eat() {
        System.out.println("Animal is eating");
    }
    
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    String name = "Dog";
    String breed;
    
    Dog(int age, String breed) {
        super(age);  // calling parent constructor
        this.breed = breed;
        System.out.println("Dog constructor called");
    }
    
    void eat() {
        super.eat();  // calling parent method
        System.out.println("Dog is eating bones");
    }
    
    void showNames() {
        System.out.println("Parent class name: " + super.name);
        System.out.println("Child class name: " + this.name);
    }
    
    void bark() {
        System.out.println("Dog is barking");
    }
}

// ==================== PROGRAM 3: HOSPITAL AND PATIENT ====================

class Hospital {
    String hospitalName;
    String location;
    int totalBeds;
    
    Hospital(String name, String location, int beds) {
        this.hospitalName = name;
        this.location = location;
        this.totalBeds = beds;
    }
    
    void showHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Location: " + location);
        System.out.println("Total beds: " + totalBeds);
    }
    
    void admitPatient() {
        System.out.println("Patient admitted to " + hospitalName);
    }
}

class Patient extends Hospital {
    String patientName;
    int patientId;
    String disease;
    
    Patient(String hospitalName, String location, int beds, String patientName, int id, String disease) {
        super(hospitalName, location, beds);
        this.patientName = patientName;
        this.patientId = id;
        this.disease = disease;
    }
    
    void showPatientInfo() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Disease: " + disease);
        System.out.println("Admitted at: " + hospitalName);
        System.out.println("Hospital location: " + location);
    }
    
    void treatPatient() {
        System.out.println("Treating " + patientName + " for " + disease);
        admitPatient();
    }
}

// ==================== PROGRAM 4: HIERARCHICAL INHERITANCE ====================

class AnimalBase {
    String name;
    int age;
    
    AnimalBase(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void eat() {
        System.out.println(name + " is eating");
    }
    
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class DogHierarchical extends AnimalBase {
    String breed;
    
    DogHierarchical(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    void bark() {
        System.out.println(name + " is barking");
    }
    
    void wagTail() {
        System.out.println(name + " is wagging tail");
    }
}

class Cat extends AnimalBase {
    String color;
    
    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    void meow() {
        System.out.println(name + " is meowing");
    }
    
    void climb() {
        System.out.println(name + " is climbing");
    }
}

class Bird extends AnimalBase {
    String species;
    
    Bird(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }
    
    void fly() {
        System.out.println(name + " is flying");
    }
    
    void chirp() {
        System.out.println(name + " is chirping");
    }
}

// ==================== PROGRAM 5: CALCULATOR OVERLOADING ====================

class Calculator {
    
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}

// ==================== PROGRAM 6: SHAPE POLYMORPHISM ====================

class Shape {
    void area() {
        System.out.println("Shape area calculation");
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    void area() {
        double area = 3.14159 * radius * radius;
        System.out.println("Circle area: " + area);
    }
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    void area() {
        double area = length * width;
        System.out.println("Rectangle area: " + area);
    }
}

// ==================== PROGRAM 7: BANK INTEREST RATES ====================

class Bank {
    double getInterestRate() {
        return 5.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.7;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.5;
    }
}

// ==================== PROGRAM 8: VEHICLE BIKE CONSTRUCTOR CHAINING ====================

class VehicleBase {
    String brand;
    
    VehicleBase(String brand) {
        this.brand = brand;
        System.out.println("Vehicle Created");
    }
    
    void start() {
        System.out.println("Vehicle starting");
    }
}

class Bike extends VehicleBase {
    String model;
    
    Bike(String brand, String model) {
        super(brand);
        this.model = model;
        System.out.println("Bike Created");
    }
    
    @Override
    void start() {
        super.start();
        System.out.println("Bike engine started");
    }
    
    void ride() {
        System.out.println("Riding the " + brand + " " + model);
    }
}

// ==================== PROGRAM 9: SMART DEVICE ABSTRACT CLASS ====================

abstract class SmartDevice {
    String brand;
    boolean isOn;
    
    SmartDevice(String brand) {
        this.brand = brand;
        this.isOn = false;
    }
    
    void turnOn() {
        isOn = true;
        System.out.println(brand + " device turned on");
    }
    
    void turnOff() {
        isOn = false;
        System.out.println(brand + " device turned off");
    }
    
    abstract void performFunction();
}

class SmartPhone extends SmartDevice {
    SmartPhone(String brand) {
        super(brand);
    }
    
    @Override
    void performFunction() {
        System.out.println("Smartphone calling and browsing");
    }
}

class SmartWatch extends SmartDevice {
    SmartWatch(String brand) {
        super(brand);
    }
    
    @Override
    void performFunction() {
        System.out.println("Smartwatch tracking fitness and time");
    }
}

class SmartSpeaker extends SmartDevice {
    SmartSpeaker(String brand) {
        super(brand);
    }
    
    @Override
    void performFunction() {
        System.out.println("Smart speaker playing music and responding to voice");
    }
}

// ==================== PROGRAM 10: BANK INTERFACE ====================

interface BankInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class Account {
    protected double balance;
    protected String accountNumber;
    
    Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
}

class SavingsAccount extends Account implements BankInterface {
    private double minBalance = 1000.0;
    
    SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    
    @Override
    public void withdraw(double amount) {
        if(balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance. Minimum balance required: " + minBalance);
        }
    }
    
    @Override
    public double getBalance() {
        return balance;
    }
}

class CurrentAccount extends Account implements BankInterface {
    private double overdraftLimit = 5000.0;
    
    CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    
    @Override
    public void withdraw(double amount) {
        if(balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }
    
    @Override
    public double getBalance() {
        return balance;
    }
}

// ==================== PROGRAM 11: VEHICLE POLYMORPHISM ====================

class VehiclePoly {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class CarPoly extends VehiclePoly {
    @Override
    void start() {
        System.out.println("Car engine started with key");
    }
}

class BikePoly extends VehiclePoly {
    @Override
    void start() {
        System.out.println("Bike started with kick");
    }
}

class Truck extends VehiclePoly {
    @Override
    void start() {
        System.out.println("Truck engine started");
    }
}

// ==================== PROGRAM 12: PERSON ABSTRACT CLASS ====================

abstract class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    abstract String getRoleInfo();
    
    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String course;
    int rollNumber;
    
    Student(String name, int age, String course, int rollNumber) {
        super(name, age);
        this.course = course;
        this.rollNumber = rollNumber;
    }
    
    @Override
    String getRoleInfo() {
        return "Student - Course: " + course + ", Roll No: " + rollNumber;
    }
}

class Professor extends Person {
    String subject;
    double salary;
    
    Professor(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }
    
    @Override
    String getRoleInfo() {
        return "Professor - Subject: " + subject + ", Salary: " + salary;
    }
}

class TeachingAssistant extends Student {
    String assistingSubject;
    
    TeachingAssistant(String name, int age, String course, int rollNumber, String assistingSubject) {
        super(name, age, course, rollNumber);
        this.assistingSubject = assistingSubject;
    }
    
    @Override
    String getRoleInfo() {
        return "Teaching Assistant - Course: " + course + ", Roll No: " + rollNumber + 
               ", Assisting in: " + assistingSubject;
    }
}

// ==================== PROGRAM 13: DRAWABLE INTERFACE WITH SHAPE ABSTRACT ====================

interface Drawable {
    void draw();
}

abstract class ShapeDrawable implements Drawable {
    String color;
    
    ShapeDrawable(String color) {
        this.color = color;
    }
    
    abstract double area();
    
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class CircleDrawable extends ShapeDrawable {
    double radius;
    
    CircleDrawable(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    double area() {
        return 3.14159 * radius * radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

class RectangleDrawable extends ShapeDrawable {
    double length, width;
    
    RectangleDrawable(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area() {
        return length * width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle " + length + "x" + width);
    }
}

class Triangle extends ShapeDrawable {
    double base, height;
    
    Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    
    @Override
    double area() {
        return 0.5 * base * height;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
    }
}

// ==================== MAIN CLASS WITH ALL DEMONSTRATIONS ====================

public class Assignment4 {
    
    // Static method for vehicle polymorphism
    static void startVehicle(VehiclePoly vehicle) {
        vehicle.start();
    }
    
    public static void main(String[] args) {
        
        System.out.println("=== PROGRAM 1: MULTILEVEL INHERITANCE ===");
        Baleno_FiveSeater_Petrol_Four_Wheeler car = new Baleno_FiveSeater_Petrol_Four_Wheeler(2023);
        car.start();
        car.drive();
        car.refuel();
        car.showSeating();
        car.showDetails();
        
        System.out.println("\n=== PROGRAM 2: SUPER KEYWORD DEMO ===");
        Dog dog = new Dog(3, "Golden Retriever");
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.showNames();
        
        System.out.println("\n=== PROGRAM 3: HOSPITAL PATIENT ===");
        Patient patient = new Patient("City Hospital", "Mumbai", 500, "John Doe", 101, "Fever");
        patient.showHospitalInfo();
        patient.showPatientInfo();
        patient.treatPatient();
        
        System.out.println("\n=== PROGRAM 4: HIERARCHICAL INHERITANCE ===");
        DogHierarchical dogH = new DogHierarchical("Buddy", 3, "Labrador");
        Cat cat = new Cat("Whiskers", 2, "Orange");
        Bird bird = new Bird("Tweety", 1, "Canary");
        
        dogH.eat();
        dogH.bark();
        cat.meow();
        bird.fly();
        
        System.out.println("\n=== PROGRAM 5: CALCULATOR OVERLOADING ===");
        Calculator calc = new Calculator();
        System.out.println("Sum of 10 and 20: " + calc.add(10, 20));
        System.out.println("Sum of 10, 20 and 30: " + calc.add(10, 20, 30));
        System.out.println("Sum of 15.5 and 25.3: " + calc.add(15.5, 25.3));
        
        System.out.println("\n=== PROGRAM 6: SHAPE POLYMORPHISM ===");
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(10.0, 6.0);
        shape1.area();
        shape2.area();
        
        System.out.println("\n=== PROGRAM 7: BANK INTEREST RATES ===");
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank hdfc = new HDFC();
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
        
        System.out.println("\n=== PROGRAM 8: CONSTRUCTOR CHAINING ===");
        Bike bike = new Bike("Honda", "CBR");
        bike.start();
        bike.ride();
        
        System.out.println("\n=== PROGRAM 9: SMART DEVICE ABSTRACT ===");
        SmartDevice[] devices = {
            new SmartPhone("Apple"),
            new SmartWatch("Samsung"),
            new SmartSpeaker("Amazon")
        };
        
        for(SmartDevice device : devices) {
            device.turnOn();
            device.performFunction();
            device.turnOff();
        }
        
        System.out.println("\n=== PROGRAM 10: BANK INTERFACE ===");
        SavingsAccount savings = new SavingsAccount("SAV001", 5000);
        CurrentAccount current = new CurrentAccount("CUR001", 3000);
        
        savings.deposit(2000);
        System.out.println("Savings Balance: " + savings.getBalance());
        savings.withdraw(6000);
        System.out.println("Savings Balance: " + savings.getBalance());
        
        current.deposit(1000);
        System.out.println("Current Balance: " + current.getBalance());
        current.withdraw(8000);
        System.out.println("Current Balance: " + current.getBalance());
        
        System.out.println("\n=== PROGRAM 11: VEHICLE POLYMORPHISM ===");
        VehiclePoly carP = new CarPoly();
        VehiclePoly bikeP = new BikePoly();
        VehiclePoly truck = new Truck();
        
        startVehicle(carP);
        startVehicle(bikeP);
        startVehicle(truck);
        
        System.out.println("\n=== PROGRAM 12: PERSON ABSTRACT CLASS ===");
        Person[] people = {
            new Student("Alice", 20, "Computer Science", 101),
            new Professor("Dr. Smith", 45, "Mathematics", 75000),
            new TeachingAssistant("Bob", 23, "Physics", 201, "Quantum Mechanics")
        };
        
        for(Person person : people) {
            person.displayBasicInfo();
            System.out.println(person.getRoleInfo());
            System.out.println();
        }
        
        System.out.println("=== PROGRAM 13: DRAWABLE INTERFACE WITH SHAPE ===");
        ShapeDrawable[] shapes = {
            new CircleDrawable("Red", 5.0),
            new RectangleDrawable("Blue", 10.0, 6.0),
            new Triangle("Green", 8.0, 4.0)
        };
        
        for(ShapeDrawable shape : shapes) {
            shape.displayColor();
            shape.draw();
            System.out.println("Area: " + shape.area());
            System.out.println();
        }
    }
}