public class animal {
    void makeSound(){
        System.out.println("Making sound");
    }

public static class dog extends animal{
    void makeSound(){
        System.out.println("Barking");
    }
}
public static class cat extends animal{
    void makeSound(){
        System.out.println("meow");
    }
}


    public static void main (String[]args){
        animal a = new animal();
        a.makeSound();
        dog b = new dog();
        b.makeSound();
        cat c = new cat();
        c.makeSound();

    }
}

