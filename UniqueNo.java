import java.util.HashSet;
import java.util.Set;

import java.util.*;
public class UniqueNo {
   public static void main(String args[]){
    int[] array={1,2,3,4,5,1,2,6,7,8,9,3,4};
    System.out.println("Original Array:");
      printArray(array);
      System.out.println("/nUniqueNo:");
      printUniqueNo(array);

   }
   public static void printUniqueNo(int[] array){
       Set<Integer>uniqueSet = new HashSet<>();
       for(int num: array){
         uniqueSet.add(num);
       }
       for (int uniqueNum : uniqueSet) {
        System.out.print(uniqueNum + " ");
    }
}

// Function to print the array
public static void printArray(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
}
}


