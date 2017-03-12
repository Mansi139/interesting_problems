/** Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
 Example:
 Input: s = "abcdefg", k = 2
 Output: "bacdfeg"
 Restrictions:
 The string consists of lower English letters only.
 Length of the given string and k will in the range [1, 10000] */

//where: leetcode contest - 23

public class reverseString{
    
    public static void main(String[] args){
        
        String input = "abcdefg";
        int k = 2;
        String output = revereseString(input,k);
        System.out.println("input: " + input + "\nOutput: " + output);
    }
    
    public static String revereseString(String s, int k){
        
        String myString = s;
        int len = s.length();
        
        if ( len < k ) return new StringBuilder(s.substring(0,len)).reverse().toString();
        
        //only have in = a, k = 2
        if(len < 2*k){
            
            s = new StringBuilder(s.substring(0,k)).reverse().toString() + myString.substring(k,len);
            
            return s;
        }
        
        for(int i = 0; i < len; i = i + 2*k){
            
            if(i == 0) {
                if(i+k < len){
                    s = new StringBuilder(s.substring(0,k)).reverse().toString() + myString.substring(k,len);
                    myString = s;
                }
            }else{
                
                // i+ k = 6 < len = abcdefg = 7
                if(i+k < len){
                    
                    s = myString.substring(0,i) + new StringBuilder(s.substring(i,i+k)).reverse().toString()
                    + myString.substring(i+k,len);
                    myString = s;
                }
                //there are only less than k characters left.
                //abcde i = 4 but only 1 left, just reverse it.
                else{
                    s = myString.substring(0,i) + new StringBuilder(s.substring(i,len)).reverse().toString();
                    
                }
            }
        }
        return s;
    }
    
    private static void print(String s){
        
        System.out.println(s);
        
    }
    
}
