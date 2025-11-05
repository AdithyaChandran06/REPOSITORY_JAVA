import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int result = 0;
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();

        boolean isNegative = false;
          
        if(num1<0 ^ num2<0) {
            isNegative=true;
        }

        for (int i = 0; i <Math.abs(num2); i++) {
            result = result + Math.abs(num1);
        }

        if(isNegative){
            result = -result;
        }
        System.out.print(result);
    }
}