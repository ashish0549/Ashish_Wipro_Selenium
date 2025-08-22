package Day_7_Assignment;
//5. Pass an object to a method and modify its internal fields
class Person {
 String name;
 int age;
 
 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
}


class CallByReference2 {
    static void modifyPerson(Person p) {
        p.name = "Modified Name";
        p.age = 99;
        System.out.println("Inside method: " + p.name + ", " + p.age);
    }
    
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println("Before method: " + person.name + ", " + person.age);
        modifyPerson(person);
        System.out.println("After method: " + person.name + ", " + person.age);
    }
}
