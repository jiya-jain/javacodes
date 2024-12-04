package BitManipulation;
 class getbit{
    public static void main(String args[]){
    //get the 3rd bit(position = 2) of a number n
    //bit mask: 1<<i (i = position);
    //Operation : AND 
     int n = 5;
     int pos = 2;
     int bitmask = 1<<pos;
     if((bitmask & n)==0){
        System.out.println("bit is 0");
     }
     else{
        System.out.println("bit is 1");
     }
    }
}