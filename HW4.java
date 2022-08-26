import java.util.Scanner;
public class HW4 {
    public static void main(String[] args) {
        int a, num, x =0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter number : ");
        a = in.nextInt();
        if (a < 0) {
            num = a * -1;
        } else {
            num = a;
        }
        if (num < 10 && num >= 0) {
            x = 1;
        } else if (num < 100 && num >= 10) {
            x = 2;
        } else if (num < 1000 && num >= 100) {
            x = 3;
        } else if (num < 10000 && num >= 1000) {
            x = 4;
        } else if (num < 100000 && num >= 10000) {
            x = 5;
        } else if (num < 1000000 && num >= 100000) {
            x = 6;
        } else if (num < 10000000 && num >= 1000000) {
            x = 7;
        } else if (num < 100000000 && num >= 10000000) {
            x = 8;
        } else if (num < 1000000000 && num >= 100000000) {
            x = 9;
        }
       else if (num < 10000000000l && num >= 1000000000) {
        x = 10;}
        System.out.println("the digits of the number is " + x);
    }
}