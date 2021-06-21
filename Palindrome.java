
/**
 * Palindrome
 */
public class Palindrome {

    public static boolean isEqual(char a, char b){
        if( a == b)
            return true; 
        return false;
    }

    public boolean isPalindrome(String input){
        //Converting input to Lowercase and removing all white spaces
        input = input.toLowerCase().replaceAll("\\s+", "");

        for(int i =0, j= input.length() - 1; i < j; i++, j--)
            if(!isEqual(input.charAt(i),input.charAt(j)))
                return false;
        return true;
    }
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("HEllo"));
        System.out.println(palindrome.isPalindrome("NON"));
       
    }

}





