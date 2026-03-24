abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circlec extends Shape{
    double r;
    Circlec(double r){
        this.r=r;
    }
    double calculateArea(){
        return Math.PI*r*r;
    }
    double calculatePerimeter(){
        return 2*Math.PI*r;
    }
}
class Triangle extends Shape{
    double a,b,c;
    Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double calculateArea(){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    double calculatePerimeter(){
        return a+b+c;
    }
}
public class prog5{
    public static void main(String[] args) {
        Circlec c=new Circlec(4.0);
        Triangle t=new Triangle(3.0,4.0,5.0);
        System.out.println("Area of the Circle: " + c.calculateArea());
        
        System.out.println("Perimeter of the Circle: " + c.calculatePerimeter());

        System.out.println("Area of the Triangle: " + t.calculateArea());
        
        System.out.println("Perimeter of the Triangle: " + t.calculatePerimeter());
    }
}