
public class RemoveChars {
    public static String remove(String str) {

      String rchars = "";
      
      for (int i = 0; i < str.length(); i++ ){

        if ( i != 0 && i != str.length() - 1) {
          
          rchars += str.charAt(i);

        }
      }
      
      return rchars;
      
    }
}
