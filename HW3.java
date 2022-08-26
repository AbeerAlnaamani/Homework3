import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        int a;
        String b="abeer";
        Scanner in= new Scanner(System.in);
        System.out.println("enter number: ");
        a= in.nextByte();
        if (a>0){
        b="positive";}
        else if (a<0) {
        b="negative";}
        else if (a==0) {
        b="zero";}
        System.out.print("the number is ");
        System.out.println(b);
    }
}
