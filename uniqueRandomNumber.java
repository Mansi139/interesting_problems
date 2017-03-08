//Question: Assume we have a way of generating n random numbers in java and we want
//to return k numbers such that all those k numbers are unique random numbers.


import java.util.ArrayList;
import java.util.Collections;


public class uniqueRandomNumber {

    public static void main(String[] args){
    
        //firstly, store these numbers in arrayList
        //Assume n = 10
        ArrayList<Integer> myList = new ArrayList<Integer>(10);
        
        
        for (int i = 0; i < 11; i++){
            myList.add(new Integer(i));
            System.out.println("i: " + i + myList.get(i));
        }
        
        //runtime of shuffle - linear time - O(n)
        Collections.shuffle(list);
        
        //assume k = 5
        for(int i = 0; i < 5; i++){
            System.out.println("i: " + list.get(i));
        
        }
    
    }
}

//KEY: they key here is to understand that instead of using randomNumber generator,
//we are using collections.shuffle to randomize the numbers.

//runtime : first for loop - O(n)
//        : shuffle - O(n)
//        : second for loop - O(k)
// total: O(n) + O(n) + O(k) = 2O(n) = O(n)
