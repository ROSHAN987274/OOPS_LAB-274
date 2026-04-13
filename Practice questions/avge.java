import java.util.Scanner;

public class avge{
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);

        try{
         
            System.out.println("Enter the number of inputs uh want:");
            int n = sc.nextInt();
            double sum=0;

            for(int i=0 ; i<n ; i++){
                System.out.println("The number " + (i+1)+ "is: ");
                int num = sc.nextInt();
                sum+=num;
                System.out.println("The sum is: "+sum);
            } 
            sc.close();
            
            double avg = sum/n;
            System.out.println("The average is:"+avg);

        }catch(Exception e){
            System.out.println("Trying entering only numbers.");
        }
    }
}