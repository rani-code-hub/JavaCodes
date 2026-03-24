class Person {
    void role(){
        System.out.println("I am a person");
    }
}
class Father extends Person{
    void role(){
        System.out.println("I am a father");
    }
}
public class Geeks {
    public static void main(String[] args) {
        Person p = new Person();
        p.role();
    }
}