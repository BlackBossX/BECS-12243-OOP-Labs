public class HRDivision {

    public static void main(String[] args) {
        Manager manager1 = new Manager("Perera", 54, 1000);
        Clerk clk1 = new Clerk("Saman", 32, 600);
        Clerk clk2 = new Clerk("Nimal", 41, 700);
        Clerk clk3 = new Clerk("Kalani", 28, 800);

        System.out.println(manager1.name + " " + manager1.age + " " + manager1.hourRate + " " + manager1.salary(10));
        System.out.println(clk1.name + " " + clk1.age + " " + clk1.hourRate + " " + clk1.salary(10));
        System.out.println(clk2.name + " " + clk2.age + " " + clk2.hourRate + " " + clk2.salary(10));
        System.out.println(clk3.name + " " + clk3.age + " " + clk3.hourRate + " " + clk3.salary(10));

        System.out.println("----------------");

        System.out.println(manager1.name+ " " + manager1.totalSalary(10, 7));
        System.out.println(clk1.name+ " " + clk1.totalSalary(10, 7));
        System.out.println(clk2.name+ " " + clk2.totalSalary(10, 7));
        System.out.println(clk3.name+ " " + clk3.totalSalary(10, 7));

    }
}
