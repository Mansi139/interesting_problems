//12:30 - 12:39
/**Question: Write a function which takes a sentence and returns the number of four letter words it contains. Don't worry about handling punctuation. 8 mins
 
Where: TripleByte */

public class letterWordsInSenetence{
    
    public static void main(String[] args){
        
        String s = "Question: Write a function which takes a sentence and returns the number of four letter words it contains. Don't worry about handling punctuation. 8 mins";
        System.out.println("count: " + findWords(s));
        
    }
    public static int findWords(String s){
        //keep count of how many 4 letter words
        int res = 0;
        
        //split string using space
        String[] str  = s.split(" ");
        
        for(int i = 0; i < str.length; i++ ){
            if(str[i].length() % 4 == 0) res++;
        }
        
        return res;
        
    }
    
}
