
import java.util.Scanner;

public class updatebit {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
    int n=3;
    int pos = 1;
    // int oper = 1; update bit to 1 else update bit to 0

    //set operation
    int bitmask = 1<<pos;
    if(oper == 1){
        int newnum = bitmask | n;
        System.out.println(newnum);
    }
   
    else{
        //clear
        int newBitmask = ~(bitmask);
        int newnum  = newBitmask & n;
        System.out.println(newnum);
    }
    }
}
