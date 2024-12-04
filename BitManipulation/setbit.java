package BitManipulation;
public class setbit {
        public static void main(String args[]){
        //set the 2nd bit(position = 1) of a number n
        //bit mask: 1<<i (i = position);
        //Operation : OR 
         int n = 5;
         int pos = 1;
         int bitmask = 1<<pos;
         int newnum = bitmask | n;
         System.out.println(newnum);
    }
}
