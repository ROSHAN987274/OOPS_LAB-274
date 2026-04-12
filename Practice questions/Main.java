class vechile{
    int speed;

    vechile(int speed){
        this.speed = speed;
    }
}

class bike extends vechile{
    int ec; 
    bike(int ec , int s){
        super(s);
        this.ec =ec;

    }
        void displayInfo(){
            System.out.println("The Info is:"+"\n"
                                +"The Speed of the car is :"+speed+"\n"
                                +"The Engine capacity is : "+ec 
            );
        }
    
}

public class Main{
    public static void main(String[] args){
        bike b = new bike(1000,1100);
        b.displayInfo();
    }
}

