import java.math.BigInteger;

public class BigIntPal {
    public static void main(String[] args) {
    	BigInteger wack = new BigInteger(16, new java.util.Random());
    	System.out.println(wack);
    	//System.out.println(isPalindrome("909"));
    	System.out.println(bintPalindrome(wack));
    }
    
   public static BigInteger bintPalindrome(BigInteger numb) {
	   BigInteger man;
	   if(!(isPalindrome(numb.toString()))) {
		   man =  new BigInteger(reverse(numb.toString()));
		   return bintPalindrome(numb.add(man));
	   } 
	   else {return numb;}
	   
   }

   

   public static boolean isPalindrome(String text)
   {
      return isPalindrome(text, 0, text.length() - 1);      
   }

   public static boolean isPalindrome(String text, int start, int end)
   {
      //Separate case for substrings of length 0 and 1.
	   
      if (start >= end) { return true; }
      else
      {
         // Get first and last characters, converted to lowercase.
         char first = text.charAt(start);
         char last = text.charAt(end);
            if (first == last)
            {
            	
               // Test substring that doesn’t contain the matching letters.
               return isPalindrome(text, start + 1, end - 1);
            }
            else
            {
            	
               return false;
            }

      }
   }
   public static String reverse(String word) {
		if(word.length() == 1) {return word;}
		char f = word.charAt(0);
		return reverse(word.substring(1, word.length())) + f;
	}


}
