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
	    int place=1, rev=0;
	    while(place<=num){
	        rev=rev*10+(num%(place*10))/place;
	        place*=10;
	    }
	    System.out.print(rev);
	    System.out.print(num==rev);
	}
}