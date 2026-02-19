public class hospitalRegistration {
    int patientId;
    String name;
    String ward;
    int age;
    String healthNotes;
    static int idCounter = 1001;

// Emergency Ward
    hospitalRegistration(){
        this.patientId = idCounter++;
        this.name = "Unknown";
        this.ward = "Emergency";
        this.age = 0 ;
    }

// OPD 
    hospitalRegistration( String name, int age, String ward){
        patientId = idCounter++;
        this.name = name;
        this.age = age;
        this.ward = ward;
        
    }

// Weekly health camps
    hospitalRegistration(String name, int age,String ward,String healthNotes ){
        patientId = idCounter++;
        this.name = name;
        this.age = age;
        this.ward = ward;
        this.healthNotes = healthNotes;
    }
        
// Display details
    void patientDetails(){
      System.out.println(" Patient Details:" + "\n"
        + "Patient Id: " + patientId +"\n"
        + "Patient Name: " +name +"\n"
        + "Age: " +age +"\n"
        + "Ward: " +ward +"\n"
        +"healthNotes:" +healthNotes +"\n"
      );
    }



    public static void main(String[] args){
        hospitalRegistration P1 = new hospitalRegistration();
        hospitalRegistration P2 = new hospitalRegistration("Roshan Chaurasiya",18 ,"OPD");
        hospitalRegistration P3 = new hospitalRegistration("Anurag Chaurasiya",28 ,"OPD","Take bed rest for a week." );

        P1.patientDetails();
        P2.patientDetails();
        P3.patientDetails();

    }

}



