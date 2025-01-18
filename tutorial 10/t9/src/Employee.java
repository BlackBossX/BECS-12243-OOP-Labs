public class Employee {
    String name;
    int idNumber;
    double payRate;
    static int employeeCounter =0;

    Employee(String name,Double payRate){
        this.name = name;
        this.payRate = payRate;
        employeeCounter++;
        this.idNumber = employeeCounter +1000;
    }

    public double calcPay(double hours){
        return hours*payRate;
    }

    public static int numberOfEmployees(){
        return employeeCounter;
    }
}
