public class order {
    String item;
    int orderQuantity;
    String address;
    String instructions;


    order(){
    this.item = "veg combo";
    this.orderQuantity= 1;
    this.address="To be updated";
    this.instructions= "none";  
    }

    order(String item, int orderQuantity){
    this.item=item;
    this.orderQuantity = orderQuantity;
    this.address = "Home Address on File."; 
    this.instructions= "none";
    }

    order(String item, int orderQuantity, String address,String instructions){
    this.item = item;
    this.orderQuantity = orderQuantity;
        this.address = address;
        this.instructions= instructions;
    }

    void orderDetails(){
        System.out.println("you have placed order and it's details are " +"\n"
            + "item = " + item +"\n"
            + "Order Quantity = " +orderQuantity +"\n"
            + "Address = " + address +"\n"
            + "Instructions = " +instructions +"\n"
        );
    }

        public static void main( String[] args){
            order O1 = new order();
            order O2 = new order("Chicken Cheese Burger",2);
            order O3 = new order("Chicken Biryani", 2,"Vengal Village", "spicy");
           
           
            O1.orderDetails();
            O2.orderDetails();
            O3.orderDetails();
          
        }
    }


