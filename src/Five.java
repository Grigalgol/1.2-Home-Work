import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b=a%3600;
        int c=b%60;
        b=b/60;
        System.out.print(a/3600%24 + ":");
        if(b<10) System.out.print("0" + b + ":");
        else System.out.print(b + ":");
        if(c<10) System.out.print("0" + c);
        else System.out.print(c);
    }
}
