public class StudentN {
    String Name;
    StudentN(String Name){
        this.Name = Name;
    };
    StudentN(){
        this.Name="Unknown";
    }

    public static void main(String[] args) {
        StudentN S1 = new StudentN("Malan");
        System.out.println(S1.Name);
        StudentN S2 = new StudentN();
        System.out.println(S2.Name);
    }
}
