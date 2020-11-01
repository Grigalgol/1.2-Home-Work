import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        a = a + 2 - (a % 2);
        System.out.println(a);
    }
}