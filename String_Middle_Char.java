class Solution {
  public static String getMiddle(String word) {
    
    int length = word.length();
    String mymiddle = "";
    int impo = 0;
    
    if (length % 2 != 0) {
      
      impo = (word.length() - 1) / 2; 
      
      mymiddle = String.valueOf(word.charAt(impo));
      
    }
    
    else {
      
      impo = word.length() / 2;
      
      mymiddle = String.valueOf(word.charAt(impo-1)) + String.valueOf(word.charAt(impo));
      
    }
    
    
    return mymiddle;
    
  }
}
