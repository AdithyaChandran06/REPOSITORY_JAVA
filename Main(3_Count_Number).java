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
	    int count = 0;
	    
	   //Method 1:
	   int place=1;
	   while(place<=num){
	       count++;
	       place*=10;
	   }
	   System.out.println(count);
	   
	   //Method 2:
	   // while(num>0){
	   //     num/=10;
	   //     count++;
	   // }
	   // System.out.print(count);
	}
}