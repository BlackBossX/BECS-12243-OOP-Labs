public class q3{
    public static int i,y =1;
    public static void main(String[] args) {

        String[][] students ={{"heshan","abhishekya","kasun"},{"pasan","dilhara","Yoosuf"},{"ayodya","naveen","kanishka"}};

        System.out.println("Seat No     Student");
        System.out.println("-------------------");

        for (String[] name:students){
            i++;
            for (String p:name){
                System.out.println(i+""+y+"          "+p);
                y++;
            }
            y=1;
        }
        }
    }

