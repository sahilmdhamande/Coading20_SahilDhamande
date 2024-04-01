package Tasks;
import java.lang.reflect.Array;
import java.util.*;
public class CountEaO {
    public static void main(String args[]){
        int[] num={5,7,2,4,9};
        int even=0, odd=0;
        System.out.println("Original array:"+ Arrays.toString(num));
        for(int i=0; i<num.length; i++){
          if(num[i]%2==0){
              even++;
          }else{
              odd++;
          }
        }
        System.out.println(even);
        System.out.println(odd);
        

    }
}
