public class animals {
    String name;
    int age;
    String diet;

     animals( String name , int age , String diet) {
       this.name = name;
       this.age=age;
       this.diet = diet;
    }
    void eat(){
        System.out.println(name+ " is Eating" );
    }

    void sleep(){
        System.out.println(name + " is Sleeping" );
    }

    void displayInfo(){
        System.out.println("The Zoo Info:" +"\n"
            + "name = "+name +"\n"
            +"age = " +age +"\n"
            + "dietType = "+diet
           
        );
    }
    static class mammals extends animals{
      String furrColor;
        mammals( String name , int age ,  String diet, String furrColor){
            super(name, age,diet);
            this.furrColor = furrColor;
        }
        void run(){
            System.out.println(name +" is running"  +"\n"  +"--------------------------------");
        }
        void displayInfo(){
            super.displayInfo();
            System.out.println("Furr Color = "+furrColor);
        }
    }
   static class birds extends animals {
        double wingSpan;
        
        birds(String name , int age , String diet , double wingSpan){
            super(name,age,diet);
            this.wingSpan = wingSpan;
        }

        void fly(){
            System.out.println(name+" is Flying"  +"\n"  +"--------------------------------");
        }
   void displayInfo(){
            super.displayInfo();
            System.out.println("wing Span = "+ wingSpan);
        }
   }

   static class Reptiles extends animals{
         boolean venomus ;

         Reptiles( String name, int age , String diet, boolean venomus){
            super(name,age,diet);
            this.venomus = venomus;
         }

         void crawl(){
            System.out.println(name+" is crawling"  +"\n"  +"--------------------------------");
         }
   void displayInfo(){
            super.displayInfo();
            System.out.println("venomus = "+venomus);
        }
   }

   public static void main( String[] args){
    mammals m = new mammals("Tommy" , 10, "Meat", "Brown");
    birds b = new birds("Penguin",11,"Veg",20.3);
    Reptiles r = new Reptiles("Dino",19,"Fish",true) ;

    m.displayInfo();
    m.eat();
    m.sleep();
    m.run();

     b.displayInfo();
    b.eat();
    b.sleep();
    b.fly();

     r.displayInfo();
    r.eat();
    r.sleep();
    r.crawl();
   }
}
