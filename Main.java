import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt(),row,col;
        for(row=1;row<=N;row++,System.out.println())
        for(col=1;col<=row;col++, System.out.printf("%c",row+64));
    }
}
