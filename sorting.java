//sort - insertion
//binary search
//sort - ascending and descending order

import java.util.Random;
import java.util.Arrays;

public class sorting{

    public static void main(String[] args){
    
        int[] myArray = new int[10];
        
        randomArray(myArray);
        
        
        System.out.println("Before: \n" + Arrays.toString(myArray));

        //insertion sort
        insertionSort(myArray);
        
        System.out.println("After: \n" + Arrays.toString(myArray));
        
        System.out.println("Binary search ");
        System.out.println("Before: \n" + Arrays.toString(myArray));

        int index = binarySearch(myArray,3);
        
        System.out.println("found at: " + index);
        
        randomArray(myArray);
        
        System.out.println("\nsortInDescendingOrder: \nBefore: \n" + Arrays.toString(myArray));

        sortInDescendingOrder(myArray);
        
        System.out.println("After: \n" + Arrays.toString(myArray));
        
        //randomized array
        randomArray(myArray);

        System.out.println("\nsortInAscendingOrder: \nBefore: \n" + Arrays.toString(myArray));

        sortInAscendingOrder(myArray);
        
        System.out.println("After: \n" + Arrays.toString(myArray));

    }
    
    //return index of specified key
    public static int binarySearch(int[] my, int key){
    
        int low = 0;
        int high = my.length;
        int mid = (low+high)/2;
        
        while ( low <= high){
    
            mid = (low + high)/2;
            //System.out.println("lo : " + low + "high: " + high + "mid: " + mid);
            
            if(key < my[mid]) high = mid-1;
            else if (key > my[mid]) low= mid;
            else return mid;
        
        }
    
        return -1;
    
    }
    
    public static void insertionSort(int[] a){
    
        int value = 0, hole = 0;
        
        for(int i = 1; i < a.length; i++){
        
            value = a[i];
            hole  = i;
            
            while(hole > 0 && a[hole-1] > value){
            
                a[hole] = a[hole-1];
                hole = hole-1;
                }
            
            a[hole] = value;
            }
    }
    
    public static void sortInDescendingOrder( int[] a){
    
        int value = 0, hole = 0;
        
        for(int i = 1; i < a.length; i++){
        
            value = a[i];
            hole = i;
            
            while( hole > 0 && a[hole-1] < value){
            
                int temp = a[hole];
                a[hole] = a[hole-1];
                a[hole-1] = temp;
                hole = hole-1;
            }
        }
    
    }
    
    public static void sortInAscendingOrder( int[] a){
        
        int value = 0, hole = 0;
        
        for(int i = 1; i < a.length; i++){
            
            value = a[i];
            hole = i;
            
            while( hole > 0 && a[hole-1] > value){
                
                int temp = a[hole];
                a[hole] = a[hole-1];
                a[hole-1] = temp;
                hole = hole-1;
            }
        }
        
    }
    
    private static void randomArray(int [] a){
        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            
            a[i] = rand.nextInt(10);
        }
    
    }
}
