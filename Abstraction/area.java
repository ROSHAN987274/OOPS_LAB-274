abstract class shape{
    abstract void area();
}

class rectangle extends shape{
     void area(){
        int l = 5;
        int b = 6;
        System.out.println("The area of the rectangle is: "+ l*b );

     }
}

class circle extends shape{

    void area(){
        double r = 5.5;
        System.out.println("The area of the circle is: "+(3.14*r*r));
    }
}

public class area{
    public static void main(String[] args){
        shape []s = new shape[2];

        s[0] = new circle();
        s[1] = new rectangle();
        
        for( shape s1 : s){
            s1.area();
        }
    }
}