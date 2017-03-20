import java.util.*;

public class lookAndSay{
    public static void main(String[] args){
        
        String s = "111221";
        System.out.println("");
        lookAndSay(s);
    }
    public static void lookAndSay (String s){
        
        char c = s.charAt(0);
        
        char prev = s.charAt(0);
        int count = 0;
        char now = '\0';
        
        for(int i = 0; i < s.length(); i++){
            
            now = s.charAt(i);
            
            if(prev < now || prev > now){
                 System.out.print( count +""+ prev);
                
                //this is kind of a break statement,we need to start from count = 0 and change prev to current one.
                count = 0;
                prev = s.charAt(i);
            }
            //we are seeing this again, so increment count
            count++;
            
        }
        System.out.print( count +""+ prev);
        System.out.println("");
    }
}

