interface SmartDevice{
    void turnOn();
    void turnOff();

}

class fan implements SmartDevice{
    public void turnOn(){
        System.out.println("The fan is turned on.");
    }
    public void turnOff(){
        System.out.println("The fan is turned off.");
    }
}

class light implements SmartDevice{
    public void turnOn(){
        System.out.println("The light is turned on.");
    }
    public void turnOff(){
        System.out.println("The light is turned off.");
    }
}

public class smart{
    public static void main(String[]args){
        SmartDevice d;

        d = new fan();
        d.turnOn();
        d.turnOff();

        d= new light();
        d.turnOff();
        d.turnOn();
        
    }
}