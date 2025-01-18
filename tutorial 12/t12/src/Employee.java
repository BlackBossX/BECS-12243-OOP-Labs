public abstract class Employee {
    public String name;
    public double age;
    public double hourRate;

    public abstract double salary(double hours); //calculate salary based on hourRate
    public abstract double totalSalary(double hours,double days);


    public String toString() {
        return "name = " + name + "age = " + age + "hourRate = " + hourRate;
    }

}
