public class Student {
    String NIC;
    String Name;
    String Email;
    int ContactNumber;
    String UniversityID;
    int AcademicYr;
    double GPA;
    String Path;


    void displayInfo(){
        System.out.println("Name: "+Name+
                ", Email: "+Email+
                ". ContactNumber: "+ContactNumber);
    }

    void GpaIncrease(){
        if (AcademicYr==2){
            System.out.println(GPA+=0.0001);
        }

    }

}
