public class booking {
    int rate;
    String name;
    String roomType;
    int floorNumber;
    

 
    booking(){
    this.rate = 2000;
    this.name = "Walk-in-Guest.";
    this.roomType = "Standard";
    this.floorNumber = 0;
}

   booking(int rate , String name, String roomType, int floorNumber ){
   this.rate = rate;
   this.name = name;
   this.roomType =roomType;
   this.floorNumber = floorNumber;
}
    
   booking(booking b , String newName){
    this.name = newName;
    this.rate = b.rate;
    this.roomType = b.roomType;
    this.floorNumber = b.floorNumber;
}


    void guestInfo(){

        System.out.println("Guest Information:" +"\n"
            + "Name = " + name  +"\n"
            + "Rate = " + rate  +"\n"
            +"Room Type = " +roomType  +"\n"
            + "floor Number = " +floorNumber
        );
    }

public static void main( String[] args){
    booking b1 = new booking();
    booking b2 = new booking(3000,"Roshan Chaurasiya", "Standard", 10);
    booking b3 = new booking(b2,"Anuj purbe");

    b1.guestInfo();
    b2.guestInfo();
    b3.guestInfo();
}
}
