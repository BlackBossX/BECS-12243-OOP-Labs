import java.util.Scanner;
public class q3 {

    public static boolean allLess(int[] arr,int[] arr2) {
        if (arr.length != arr2.length){
            return false;
        }else {
            for (int i=0;i<arr.length;i++){
                if(arr[i]<arr2[i]){
                    continue;
                }else {
                    return false;
                }

            }
            return true;
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1={10, 20, 30, 40, 50};
        int[] array2={35, 30, 60, 73, 55};

        System.out.println(allLess(array1,array2));


    }
}



