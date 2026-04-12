import java.util.Scanner;

public class studentMarks {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);


        System.out.println("Enter the number: ");
        int n = obj.nextInt();
         
        int []marks = new int[n];
        int total = 0;

        for( int i=0; i< n; i++){
           System.out.println("The mark of index "+ (i+1)+ "is: "+ marks[i]);
           marks[i] = obj.nextInt();
           total += marks[i];
           System.out.println("The total marks is: "+total);
        }

        double avg = total/n;
        System.out.println("The average marks is: "+avg);
        
        int max = marks[0];
        int topIndex = 0;
        for( int i=0; i<n; i++){
            if (marks[i]>marks[0]){
                max = marks[i];
                topIndex = i;
                System.out.println("The max marks is: " +max +"The top index is: "+topIndex);
            }
        }

        obj.close();
    }


}
