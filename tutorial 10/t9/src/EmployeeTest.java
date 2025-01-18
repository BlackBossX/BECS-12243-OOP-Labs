import java.io.FilterOutputStream;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee obj1 = new Employee("Saman",1000.0);
        Employee obj2 = new Employee("Amal",2500.0);
        Employee obj3 = new Employee("kamala",1250.0);

        double samanPay= obj1.calcPay(40);
        double amalPay = obj2.calcPay(35);
        double kamalaPay= obj3.calcPay(20);

        System.out.println("Name: "+obj1.name+", ID: "+obj1.idNumber+", Pay Rate: "+obj1.payRate);
        System.out.println("Name: "+obj2.name+", ID: "+obj2.idNumber+", Pay Rate: "+obj2.payRate);
        System.out.println("Name: "+obj3.name+", ID: "+obj3.idNumber+", Pay Rate: "+obj3.payRate);

        System.out.println(obj1.name+"'s Pay for 40 hours: "+samanPay);
        System.out.println(obj2.name+"'s Pay for 35 hours: "+amalPay);
        System.out.println(obj3.name+"'s Pay for 20 hours: "+kamalaPay);


        System.out.println("Total Employees: "+Employee.employeeCounter);
    }

}
