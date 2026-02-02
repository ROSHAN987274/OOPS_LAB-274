import java.util.Scanner;
public class control {
    public static void main(String[] args) {
    Scanner obj= new Scanner(System.in);
          
    System.out.println("What is the MRP of this product?");
    int MRP = obj.nextInt();
    System.out.println("What kind of membership does the customer have?");
    obj.nextLine();
    int finalPrice;
    String membership = obj.nextLine();

    if(MRP >= 5000 && membership.equalsIgnoreCase("Gold")){
     System.out.println("You got 20% discount...");
     finalPrice = MRP - (MRP*20)/100;
    System.out.println("The MRP was"+MRP+"The discunt given was 20% "+".So,the final bill is:"+finalPrice);
    }
    else if(MRP>=4000 && MRP<=2000 && membership.equalsIgnoreCase("Silver")){
    System.out.println("You got 10% discount...");
    finalPrice = MRP - (MRP*10)/100;
    System.out.println("The MRP was"+MRP+"The discunt given was 20% "+".So,the final bill is:"+finalPrice);
    }
    else if(MRP<2000 && membership.equalsIgnoreCase("None")){
        System.out.println("Sorry No Discount for you.Your bill is:"+MRP);
    }
    else{
        System.out.println("Plzz Enter the membership correctly:");
    }
    obj.close();
    }  
}
