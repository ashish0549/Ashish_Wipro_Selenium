package Day_3_Assignment;

public class Variables_Employee {

	
    String name;
    int age;
    static String companyName = "Wipro";
    public Variables_Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
   
    public void displayEmployeeDetails() {
        int employeeId = 101; 
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Company Name: " + companyName);  // Static variable accessed through class
    }

    public static void main(String[] args) {
        
        Variables_Employee emp1 = new Variables_Employee("Nasir", 22);
        emp1.displayEmployeeDetails(); // Calling the method to display details

       
        Variables_Employee emp2 = new Variables_Employee("Suhas", 21);
        emp2.displayEmployeeDetails();
    }
}
