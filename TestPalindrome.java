
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Before;
import org.junit.Test;
 

    public class TestPalindrome{
        private String input;
        private Palindrome palindrome;

        @Before
        public void setUp() throws Exception {
    
            input = null;
            palindrome = new Palindrome();
    
        }
     
        @Test 
        public void emptyStringPalindromeTest(){
            input = "";
            assertTrue(palindrome.isPalindrome(input));
        }

        @Test
        public void singleCharTest(){
            input = "A";
            assertTrue(palindrome.isPalindrome(input));
        }

        @Test
        public void twoCharPalindromeTest(){
            input = "AA";
            assertTrue(palindrome.isPalindrome(input));
        }

        @Test
        public void twoCharNotPalindromeTest(){
            input = "AS";
            assertFalse(palindrome.isPalindrome(input));

        }

        @Test
        public void threeCharPalindromeTest(){
            input = "ASA";
            assertTrue(palindrome.isPalindrome(input));
        }

        @Test
        public void threeCharNotPalindromeTest(){
            input = "ASD";
            assertFalse(palindrome.isPalindrome(input));
        }

        @Test
        public void evenLengthPalindromeTest(){
            input = "ASDFFDSA";
            assertTrue(palindrome.isPalindrome(input));
        }

        @Test
        public void evenLengthNotPalindromeTest(){
            input = "ASDFGDSA";
            assertFalse(palindrome.isPalindrome(input));
        }

        @Test 
        public void oddLengthPalindromeTest(){
            input = "ASDFDSA";
            assertTrue(palindrome.isPalindrome(input));
        }

        @Test 
        public void oddLengthNotPalindromeTest(){
            input = "ASDFDSP";
            assertFalse(palindrome.isPalindrome(input));
        }

        @Test
        public void whiteSpacePalindromeTest() {
            input = "AS DFGH  JK   JHGF DSA";
            assertTrue(palindrome.isPalindrome(input));
        }

        @Test
        public void alphaNumericPalindromeTest() {
            input = "AS 121 SA";
            assertTrue(palindrome.isPalindrome(input));
        }
    }