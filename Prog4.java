abstract class Animal{
    abstract void Sound();
}
class Lion extends Animal{
    void Sound(){
        System.out.println("A lion ROARS");
    }
}
class Tiger extends Animal{
    void Sound(){
        System.out.println("A lion GROWLS");
    }
}
public class Prog4{
    public static void main(String[] args) {
        Tiger t= new Tiger();
        t.Sound();
        Lion l= new Lion();
        l.Sound();
    }
}