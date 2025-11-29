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
	    
	   // Method 1:
	   int place=1;
	   while(place<=num){
	       System.out.print((num%(place*10))/place);
	       place*=10;
	   }
	    
	   // Method 2:
	   // while(num>0){
	   //     System.out.print(num%10);
	   //     num/=10;
	   // }
	   
	   //Method 3:
	   // int rev = 0, n=0;
	   // while(num!=0){
	   //     n=num%10;
	   //     rev=rev*10+n;
	   //     num/=10;
	   // }
    //     System.out.println(rev);
	}
}