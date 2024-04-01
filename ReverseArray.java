package Tasks;
import java.util.*;
public class ReverseArray {
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // // int[] array=sc.nextInt[]();
        // int[] array = new int[10]; 
        int[] array={1,2,3,4,5};
        System.out.println("Original Array:");
        printArray(array);
        reverseArray(array);
        System.out.println("\nReversed Array:");
        printArray(array);
    }
    public static void reverseArray(int[]array){
        int start=0;
        int end = array.length-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;

        }
    }
    //fun to print array
    public static void printArray(int[]arr){
        for(int num :arr){
            System.out.print(num+"");
        }
    }
}
