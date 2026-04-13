import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sort {
    
    public static void main(String[] args){

        try{
        File fr = new File("name.txt");
        Scanner sc = new Scanner(fr);
        
        String []names = new String[10];
        int n =0;
        while(sc.hasNextLine()){
           names[n] = sc.nextLine();
           n++;
        }
        sc.close();

        for(int i=0; i<n;i++){
            for(int j= i+1; j<n ;j++){
                if(names[i].compareTo(names[j]) > 0){
                 String temp = names[i];
                 names[i]=names[j];
                 names[j]=temp;
                }
            }
        }
          System.out.println("The sorted names are:");
           for(int i=0;i<n;i++){
            System.out.println(names[i]);
           }
   

    }catch(FileNotFoundException e){
        System.out.println("The is not found.");
        
    }
}
}
