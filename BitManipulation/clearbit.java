package BitManipulation;
public class clearbit {
     public static void main(String args[]){
        //clear the 3rd bit(position = 2) of a number n
        //bit mask: 1<<i (i = position);
        //Operation : AND with NOT 
         int n = 5;
         int pos = 2;
         int bitmask = ~(1<<pos);   //~ means not
         int newnum = n & bitmask;
        System.out.println(newnum);
    }
}
