abstract class Subject{
    Subject(){
        System.out.println("learning a variety of codding languages");
    }
    abstract void lang();
    void Learn(){
        System.out.println("start from today!!");
    }
}
class C extends Subject{
    void lang(){
        System.out.println("this method is for learning C");
    }
}
class Java extends Subject{
    void lang(){
        System.out.println("this method is for learning Java");
    }
}
class Python extends Subject{
    void lang(){
        System.out.println("this method is for learning Java");
    }
}
public class Prog3{
    public static void main(String[] args) {
        
        C ob1=new C();
        ob1.lang();
        ob1.Learn();
        Java ob2=new Java();
        ob2.lang();
        Python ob3=new Python();
        ob3.lang();
    }
}