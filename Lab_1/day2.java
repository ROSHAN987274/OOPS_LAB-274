import java.util.Scanner;
public class day2{
    public static void main( String args[]){
     Scanner obj = new Scanner(System.in);
    System.out.println("Enter a number:");
    int a =obj.nextInt();
    System.out.println("Enter another number:");
    int b = obj.nextInt();
    int c = a+b;
    System.out.println("The sum of two numbers is:" + c);
    c= a-b;
    System.out.println("The difference of two number is:"+c);
    c=a*b;
    System.out.println("The product of two numbers is:" +c);
    c=a/b;
    System.out.println("The division of two numbers is:"+c);


     System.out.println("Enter any number.");
     int d = obj.nextInt();
     if( d > 0){
    System.out.println("It is a positive number");
     }
     else{
        System.out.println("It is Negative number.");
     }
    


     System.out.println("Enter marks of physics");
     int phy= obj.nextInt();
     System.out.println("Enter the marks of chemistry");
     int che= obj.nextInt();
     System.out.println("Enter the marks of maths");
     int maths = obj.nextInt();
     int total_marks =  phy + che + maths;
     System.out.println("The Total Marks is:"+total_marks);
     float avg_marks = total_marks/3.0f;
     System.out.println("The Avg Marks is:"+avg_marks);
    
     if(avg_marks >= 90 ){
        System.out.println("Excellent");
     }
     else if (avg_marks >= 80 && avg_marks <= 89){
      System.out.println("Very Good.");
    }
     else if (avg_marks >= 70 && avg_marks <= 79){
      System.out.println("Good");
    }
    else if (avg_marks <70){
        System.out.println("You need to work hard.");
    }


    System.out.println("Enter the value of day in integer:");
    int day=obj.nextInt();
    switch(day){
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        default:
            System.out.println("Invalid day");
    }
    }
  }
