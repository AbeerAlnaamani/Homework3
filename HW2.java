import java.sql.SQLOutput;
import java.util.Scanner;
public class HW2 {
    public static void main(String[] args) {
        int x;
        char y;
        String color;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number from 1 to 8 :");
        x = input.nextInt();
        System.out.println("Enter later from a to h :");
        y = input.next().charAt(0);
        if ((y == 'a') || (y == 'c') || (y == 'e') || (y == 'g'))
        {
            if (x % 2 == 1) {
                color = "Black";
                System.out.println(color);
            } else if (x % 2 == 0) {
                color = "White";
                System.out.println(color);
            }
        }
        else if ((y == 'b') || (y =='d' ) || (y == 'f') || (y == 'h'))
            if (x % 2 == 0) {
                color = "Black";
                System.out.println(color);
            } else if (x % 2 == 1) {
                color = "White";
                System.out.println(color);
            }

    }

}


