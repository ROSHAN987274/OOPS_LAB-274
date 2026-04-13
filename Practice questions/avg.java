import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class avg{

    public static void main(String[] args){

        String filename = "number.txt";

        double  sum =0;
        int count = 0;

        try{
            File file = new File(filename);

            Scanner sc = new Scanner(file);

            while(sc.hasNext()){
                if(sc.hasNextDouble()){
                    double num = sc.nextDouble();
                  sum += num;
                  System.out.println("The sum is: "+sum);
                  count++;
                }else{
                    System.out.println("File doesnot contains any number.");
                    sc.next();
                }

                
            }

            if(count> 0){
                double avg = sum/count;
                System.out.println("The average is: "+avg);
            }
            
        sc.close();

        }catch(FileNotFoundException e){
            System.out.println("Error Filename: " + filename +" not found.");
            
        }

    }
}