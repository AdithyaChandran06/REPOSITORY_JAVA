/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    int sum_even = 0, sum_odd=0;
	    
	   // Method 1:
	   int place = 1;
	   while(num>=place){
	       int n = (num%(place*10))/place;
           if(n%2==0){
                sum_even+=n;
            }
            else{
                sum_odd+=n;
            }
            place*=10;
	       }
	   
	    System.out.println(sum_even);
        System.out.println(sum_odd);
	   }
	    
	   // Method 2:
	   // int temp=0;
	   // while(num>0){
	   //     temp=num%10;
	   //     if(temp%2==0){
	   //         sum_even+=temp;
	   //     }
	   //     else{
	   //         sum_odd+=temp;
	   //     }
	   //     num/=10;
	   // }
}
