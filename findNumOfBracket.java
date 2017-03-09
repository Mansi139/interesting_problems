/**A string of brackets is correctly matched if you can pair every opening bracket up with a later closing bracket,
 and vice versa. For example, "(()())" is correctly matched, and "(()" and ")(" are not. Implement a function
 which takes a string of brackets and returns the minimum number of brackets you'd have to add to the string
 to make it correctly matched. For example, "(()" could be correctly matched by adding a single closing
 bracket at the end, so you'd return 1. ")(" can be correctly matched by adding an opening bracket at the
 start and a closing bracket at the end, so you'd return 2. If your string is already correctly matched,
 you can just return 0. 8 min
 
Where: TripleByte*/

//12:46 - 1:05, oh well!

import java.util.Stack;

public class findNumOfBracket{
    
    public static void main(String[] args){
        
        Stack<Character> myStack = new Stack<Character>();
        
        String str = ")()(";
        System.out.println(" count: " + findBracketCount(myStack, str));
        
        
    }
    
    public static int findBracketCount(Stack<Character> stc, String s){
        
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '(') {
                stc.push('(');
            }
            else {
                if(stc.isEmpty() == false) {
                    stc.pop();
                }
                else{
                    count = count+1;
                }
            }
        }
        
        //at the end empty the stack to see how many unmatched brackerts are left
        if(stc.isEmpty() == false) {
            
            while(!stc.isEmpty()) {
                stc.pop();
                count = count+1;
            }
        }
        return count;
        
    }
}
