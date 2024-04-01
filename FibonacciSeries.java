// package Tasks;

// public class FibonacciSeries {
//     public static void main(String args[]){
//         int num=16;
//         int a=0,b=1;
//         System.out.println(a+","+b+",");
//         int nextTerm;
//         for(int i=2; i<num; i++){
//             nextTerm=a+b;
//             a=b;
//             b=nextTerm;
//             System.out.print(nextTerm+",");
//         }
//     }
    
// }

package Tasks;
import java.util.*;

public class FibonacciSeries{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0,b=1;
        System.out.println(a+","+b+",");
        int nextTerm;
        for(int i=2; i<num; i++){
            nextTerm=a+b;
            a=b;
            b=nextTerm;
            System.out.println(nextTerm+",");
        }
    }
}