package Tasks;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class CommonEle {
    public static void main(String args[]){
        int[] array1={1,2,3,4,5,6,7,8};
        int[] array2={9,12,3,5,10,11,6};
        List<Integer> CommonElements = new ArrayList<>();
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
             if(array1[i]==array2[j]){
                 CommonElements.add(array1[i]);
             }
            }
        }
        System.out.println("Common Elements:"+ CommonElements);

    }
}
