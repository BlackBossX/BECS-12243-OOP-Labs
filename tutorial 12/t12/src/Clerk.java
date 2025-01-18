public class Clerk extends Employee {

    Clerk() {
    }

    Clerk(String name, double age, double hourRate) {
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }

    public double salary(double hours) {
        return hourRate * hours;
    }

    public double totalSalary(double hours,double days) {
        return hours * days * hourRate;
    }
}
