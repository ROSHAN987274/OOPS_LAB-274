import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fwriter{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data you wanna enter to your file.");
        
        String data = sc.nextLine();

        try{

            FileWriter fw = new FileWriter("number.txt");

            fw.write(data);
            fw.close();
            System.out.println("The data is written successfully.");

            sc.close();
        }catch(IOException e){
            System.out.println("Data can't be written in file.");
        }
    }
}
