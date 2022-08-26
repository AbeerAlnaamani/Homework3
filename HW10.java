import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
     int month,day=0;
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number of the month");
        month=in.nextInt();
        if (month==2){
            day=28;}
        else if ((month==4)||(month==5)||(month==6)||(month==9)||(month==11)) {
            day=30;}
        else if ((month==1)||(month==3)||(month==7)||(month==8)||(month==10)||(month==12)) {
            day=31;}
        System.out.println(day+" days");
    }
    }
