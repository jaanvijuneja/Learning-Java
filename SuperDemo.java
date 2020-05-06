
package mysql.project;

class Box{
    double i;
}

class Box2 extends Box{
    double i;
    
    Box2(double a, double b)
    {
        super.i = a;
        i = b;
    }
    
    public String toString(){
        return "Super.i:" + super.i + " i:" + i ; 
    }
    
}
public class SuperDemo {

    
    public static void main(String[] args) {
       Box2 b = new Box2(15.5,18.5);
        System.out.println(b);
    }
    
}
