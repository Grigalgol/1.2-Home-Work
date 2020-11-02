import java.util.Scanner;

public class DOPTHREE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int s=0;
        s=s+a%10;
        a=a/10; s=s+a%10; a=a/10; s=s+a%10;
        System.out.println(s);
    }
}
