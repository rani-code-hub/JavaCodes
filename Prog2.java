abstract class A{
    abstract void printit();
}
class B extends  A{
    void printit(){
        String name="Srijita Sur";
        int age=20;
        char g='F';
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My gender is "+g);
    }
}
public class Prog2{
    public static void main(String[] args) {
        B ob=new B();
        ob.printit();
    }
}
