public class q2 {
    public static void main(String[] args) {
/*
        System.out.println("employeeName = " + args[0]);
        System.out.println("employeeId, hoursWorked = " + args[1]+" "+ args[2]);
        System.out.println("hourlyRate = " + args[3]);
*/
        String employeeName = args[0];
        int employeeId = Integer.parseInt(args[1]);
        int hoursWorked = Integer.parseInt(args[2]);
        double hourlyRate = Double.parseDouble(args[3]);

        double grossSalary = hourlyRate * hoursWorked;
        final double TAX_RATE = 0.1;
        double taxDeduction =  grossSalary *  TAX_RATE;
        double netSalary = grossSalary - taxDeduction;

        System.out.println("-----------------------------------");
        System.out.println("        Employee Pay Sheet         ");
        System.out.println("-----------------------------------");


        System.out.println("        Employee Name:  "+employeeName);
        System.out.println("        Employee ID:    "+employeeId);
        System.out.printf("        Hourly Rate:    %.2f\n",hourlyRate);
        System.out.println("        Hours Worked:   "+hoursWorked);
        System.out.printf("        Gross Salary:   %.2f\n",grossSalary);
        System.out.printf("        Tax Deduction:  %.2f\n",taxDeduction);
        System.out.println("-----------------------------------");
        System.out.printf("        Net Salary:    %.2f\n",netSalary);
        System.out.println("-----------------------------------");

    }
}