class shape{
    int length;
    int breadth;

    shape(int l, int b){
        length = l;
        breadth = b;

    }
}

class rectangle extends shape{
     
    rectangle(int l , int b){
        super(l,b);
    }

    void calculateArea(){
       int area = length * breadth;

       System.out.println("The Area of the rectangle is :"+ area );
    }
}

public class area{
public static void main(String[] args){
    rectangle r = new rectangle(10,5);

    r.calculateArea();

}
}