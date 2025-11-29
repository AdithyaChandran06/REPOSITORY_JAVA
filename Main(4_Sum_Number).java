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
	    int sum = 0;
	    
	   // Method 1:
	    int place = 1;
	    while(place<=num){
	        sum += (num%(place*10)/place);
	        place*=10;
	    }
	    System.out.print(sum);
	    
	   // Method 2:
	   // while(num>0){
	   //     sum += num%10;
	   //     num/=10;
	   // }
	   // System.out.print(sum);
	}
}