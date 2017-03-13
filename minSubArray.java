/**Given an array of integers (A[])  and a number x, find the smallest subarray with sum greater than the given value.
 
 Examples:
 A[] = {1, 4, 45, 6, 0, 19}
 x  =  51
 Output: 3
 Minimum length subarray is {4, 45, 6}
 
 A[] = {1, 10, 5, 2, 7}
 x  = 9
 Output: 1
 Minimum length subarray is {10}*/

//Where: geeksforgeeks

import java.util.*;
import java.lang.*;
import java.io.*;

class minSubArray {
    public static void main (String[] args) {
        
        int[] a =  new int[]{100, 50, 1, 21, 87};
        int x = 50;
        int res = minSubArray(a,x);
        System.out.println("result: " + res);
        
    }
    
    private static int minSubArray(int[] a, int x){
        
        int flag = 0;
        int min = 0;
        
        for(int i =0; i < a.length; i++){
            int count = 0;
            int sum = 0;
            
            if(a[i] > x) return 1;
            
            for(int j = i-1; j < a.length;j++){
                
                if(i == 0 && j == -1) {}
                else{
                    sum = sum + a[j];
                    count++;   //how many array elements we have added to get this sum

                    if(sum > x){
                        //the first time we see something > x, we need to assign that as min
                        if(flag == 0) {
                            min = count;
                            flag = -1;
                        }
                        if(count < min) min = count;
                    }
                }
            }
        }
        
        return min;
        
    }
}
