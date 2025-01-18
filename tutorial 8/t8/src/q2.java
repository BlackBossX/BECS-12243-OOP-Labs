import java.util.Scanner;
public class q2 {

    public static void minGap(int[] arr) {
        for (int i=1;i<arr.length;i++){
            int no = Math.abs((arr[i]-arr[i-1]));
            System.out.println(no);
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Enter no of elements do you need: ");
       int elements = input.nextInt();

       // int[] createdAr = {1, 3, 6, 5,12};
        int[] array = new int[elements];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < elements; i++) {
            array[i] = input.nextInt();
        }

        minGap(array);

/*        for (int i=0; i<elements;i++){
            int[] newArray = new int[elements];
            System.out.print("Enter element "+i+": ");
            int count = input.nextInt();
            newArray[i]=count;
            System.out.print(newArray[0]);
        }
        */

    }
}



