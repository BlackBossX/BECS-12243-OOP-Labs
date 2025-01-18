public class Staff {
    String NIC;
    String Name;
    String Email;
    int ContactNumber;
    String UniversityID;
    double Salary;
    String department;


    void displaystaffInfo(){
        System.out.println("Name: "+Name+
                         ", Email: "+Email+
                         ". ContactNumber: "+ContactNumber);
    }

    void salaryIncrement(){
        if (department=="CS"){
            System.out.println(Salary+=(Salary*0.05));
        }
    }

}