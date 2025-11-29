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
	    int a =1;
		for(int i=0; i<n; i++){
		    for(int j=0; j<n-i; j++){
		        System.out.print("* ");
		    }
		    for (int j=0; j<a; j++){
		        System.out.print("  ");
		    }
		    a+=2;
		    for(int j=0; j<n-i; j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		  //  System.out.println(a);
		}
		for(int i=1; i<n; i++){
		    for(int j=0; j<i+1; j++){
		        System.out.print("* ");
		    }
		    a-=2;
		    for (int j=0; j<a-2; j++){
		        System.out.print("  ");
		    }
		    for(int j=0; j<i+1; j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		  //  System.out.println(a);
		}
		
		
	}
}

//star diamond
//combined triangle star pattern
//symmetric void
//right facing star pattern arrow