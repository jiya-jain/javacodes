import java.util.*;
public class Arraylist {
//variable size array
// only objects can be stored(nt primitive)
// heap m bnti hn
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();        //Initialise
        //add ele
        list.add(1);

        //get ele
        list.get(0);

        //add ele in between
        list.add(1,3);

        //set element (change)
        list.set(0, 5);

        //delete ele
        list.remove(1);

        //size of arraylist
        int size= list.size();

        //loops
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //sort
        Collections.sort(list);
        
        System.out.println(list);
    }
}
