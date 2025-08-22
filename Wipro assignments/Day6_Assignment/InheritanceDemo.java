package Day_6_Assignment;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = d;
        a.makeSound();
    }
}
