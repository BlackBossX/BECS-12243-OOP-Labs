public class Member {
    String Name;
    int Age;
    int Phone_Num;
    String Address;
    double Salary;

    public void printSalary(){
        System.out.println(this.Name + " Salary is : " + Salary);
    }

    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.Name="Malan";
        E1.Age=22;
        E1.Phone_Num=757292396;
        E1.Address = "Sandya,thalavitiya,parakaduwa";
        E1.Salary = 5000.00;
        E1.specialization = "IT";

        Manager M1 = new Manager();
        M1.Name="Alwis";
        M1.Age=25;
        M1.Phone_Num=780055000;
        M1.Address = "No.30,jaffna";
        M1.Salary = 6000.00;
        M1.department="CS";

        M1.printSalary();
        E1.printSalary();
        System.out.println();
        System.out.println(E1.Name);
        System.out.println(E1.Age);
        System.out.println(E1.Phone_Num);
        System.out.println(E1.Address);
        System.out.println(E1.Salary);
        System.out.println(E1.specialization);
        System.out.println();
        System.out.println(M1.Name);
        System.out.println(M1.Age);
        System.out.println(M1.Phone_Num);
        System.out.println(M1.Address);
        System.out.println(M1.Salary);
        System.out.println(M1.department);
    }
}

class Employee extends Member{
    String specialization;
}

class Manager extends Member{
    String department;
}
