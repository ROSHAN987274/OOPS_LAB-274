class room{

    double getRate(){
        return 0;
    }
}

class Delux extends room {

    double getRate(){
        return 3000;
    }
}

class Standard extends room{
     
    double getRate(){
        return 1000;
    }
}

public class booking{
    public static void main(String[] args){
       room []r = new room[2];

       r[0] = new Delux();
       r[1] = new Standard();
           
       double total =0;
       for(room r1: r){
        total = r1.getRate();
        System.out.println("The total cost of the rooms is: "+total);
       }
    }
}