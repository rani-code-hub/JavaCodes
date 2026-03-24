public class MyClass {
    String name;
    int age;

    // Constructor 1: Takes name and age
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Two-argument constructor called.");
    }

    // Constructor 2: Takes only name, calls Constructor 1 with a default age
    public MyClass(String name) {
        this(name, 0); // Calls the two-argument constructor
        System.out.println("One-argument constructor called.");
    }

    // Constructor 3: No arguments, calls Constructor 2 with a default name
    public MyClass() {
        this("Unknown"); // Calls the one-argument constructor
        System.out.println("No-argument constructor called.");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(); // Calls no-arg, then one-arg, then two-arg
        obj1.display();

        MyClass obj2 = new MyClass("Alice"); // Calls one-arg, then two-arg
        obj2.display();

        MyClass obj3 = new MyClass("Bob", 30); // Calls two-arg directly
        obj3.display();
    }
}

