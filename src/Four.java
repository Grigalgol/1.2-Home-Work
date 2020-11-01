import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), n = in.nextInt();
        int s=a*n+b*n/100;
        int k=b*n%100;
        System.out.println(s + " " + k);
    }
}
