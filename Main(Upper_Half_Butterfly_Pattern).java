/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a = (n*2)-3;
	    for(int i=0; i<n; i++){
		    for(int j=0; j<=i; j++){
		        System.out.print("* ");
		    }
		    for (int j=0; j<=a; j++){
		        System.out.print("  ");
		    }
		    a-=2;
		    for(int j=0; j<=i; j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}