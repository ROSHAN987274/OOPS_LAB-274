public class shape{
    double Area;
public static class circle extends shape{
    double r =5 ;
    void area(){
      Area = 3.14*r*r;
      System.out.println("The area of the circle is : "+Area);
    }
    
}

public static class rectangle extends shape{
    int lenght = 5 , breadth = 4;
    void area(){
        Area = lenght*breadth;
        System.out.println("The area of the rectangle is : " +Area);
    } 
}

public static class triangle extends shape{
    int l = 4;
    int h = 5;
    void area(){
        Area = 0.5*l*h;
        System.out.println("The area of the triangle is : " + Area);
    }
}

public static void main(String[]args){
    circle c = new circle();
    c.area();
    rectangle r = new rectangle();
    r.area();
    triangle t = new triangle();
    t.area();
}
}