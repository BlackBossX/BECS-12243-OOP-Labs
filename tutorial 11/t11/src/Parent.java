public class Parent {
    public void PMsg(){
        System.out.println("This is parent class");
    }

    public static void main(String []args){
        Parent p1 = new Parent();
        p1.PMsg();

        Child c1 = new Child();
        c1.CMSg();

        c1.PMsg();
        //p1.CMsg();
    }
}
