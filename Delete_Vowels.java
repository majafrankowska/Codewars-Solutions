
public class Troll {
    public static String disemvowel(String str) {
      
      String newchar = "";
      //vowels = 'a', 'e', 'i', 'o', 'u';
      //consonants = 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z';
      
      for ( int i = 0; i < str.length(); i++){
      
      if ( str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U' ) {
        
        newchar += str.charAt(i);
      }
        }
      
      return newchar;
    }
}
