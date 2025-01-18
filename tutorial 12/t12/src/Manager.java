public class Manager extends Employee {

    Manager() {
    }

    Manager(String name, double age, double hourRate) {
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }

    public double salary(double hours) {
        return hours * hourRate;
    }

    public double totalSalary(double hours,double days) {
        return hours * days * hourRate;
    }
}
