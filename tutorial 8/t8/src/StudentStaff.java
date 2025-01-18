public class StudentStaff {

    public static void main(String[] args) {

    Staff staffMember = new Staff();
    Student studentMemeber = new Student();

    staffMember.Name ="Dr. Saman Perera";
    staffMember.UniversityID ="U001";
    staffMember.NIC ="1111";

    studentMemeber.Name ="Ms. Nilanka Silva";
    studentMemeber.UniversityID ="PS/2016 /001";
    studentMemeber.NIC ="9999";

    studentMemeber.displayInfo();
    studentMemeber.GpaIncrease();

    staffMember.displaystaffInfo();
    staffMember.salaryIncrement();





    }
}
