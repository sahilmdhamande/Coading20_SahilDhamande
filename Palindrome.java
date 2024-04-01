package Tasks;
import java.util.Scanner;

public class Palindrome {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter a no.");
       int number=sc.nextInt();
       int r,sum=0,temp;
         
       temp=number;
       while(number>0){
           r=number%10;
           sum=(sum*10)+r;
           number=number/10;
       }

       if(temp==sum){
           System.out.println("palindrome no");
       }else{
           System.out.println("not palindrome");
       }
       
   }    
}
