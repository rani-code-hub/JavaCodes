class Persoon{
    void message(){
        System.out.println("This is a person class\n");
    }
}
class Student extends Persoon{
    void message(){
        System.out.println("This is a student class \n");
    }
    void display(){
            message();
            super.message();
        }
}

public class Me {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1 .display();
    }
}
