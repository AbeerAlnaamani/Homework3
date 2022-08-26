import java.util.Scanner;
public class HW6 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println(" enter three number : ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if ((a<b) && (b<c)) {
            System.out.println("increasing");
        } else if ((a>b) && (b>c)) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }
    }
}
