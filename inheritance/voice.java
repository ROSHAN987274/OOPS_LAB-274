interface voice{
    void command(String c);


class appliance{
     String brand;

     void turnOn(){
        System.out.println("ON");
     }

     void turnOff(){
        System.out.println("OFF");
     }
}

class light extends appliance implements voice {

    @Override
    public void command(String c){
        System.out.println("Executing " + c);
    }
}

class thermo extends appliance implements voice{

    @Override
    public void command(String c){
        System.out.println("Executing"+c);
    }
}


public static void main(String[] args){
    light l = new light();
    thermo t  = new thermo();

    l.turnOn();
    l.command("Turning on the light ");

    t.turnOff();
    t.command("Turning off the thermo");

}

}