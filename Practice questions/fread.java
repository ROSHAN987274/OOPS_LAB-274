import java.io.*;
import java.util.Scanner;


public class fread { 
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details:");

        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();
       
        try{
        FileWriter fw = new FileWriter("output.txt");
        
        fw.write("Name:"+name);
        fw.close();
        System.out.println("The data is entered successfully.");

        FileReader fr = new FileReader("output.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

        System.out.println("Reading the file:");

        while((line = br.readLine()) != null) {
         System.out.println(line);
        }
        br.close();

        sc.close();

    }catch(IOException e){
        System.out.println("Error!");
    }
    }

}
