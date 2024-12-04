import java.util.*;
//Unchecked question
public class UnionArrays {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int key: map.keySet()){
        map.put(arr2[i],1);
    }
    for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            //1 2 3 4
            //3 4 5 6
            map.put(arr[i],0);
        }
        else{
            map.put(arr[i],1);
        }
    }
    for( Map.Entry<Integer, Integer> e: map.entrySet()){
        if(e.getValue()==1){
            arl.add(e.getValue());
        }
    }
}
