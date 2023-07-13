
public class isogram {
    public static boolean  isIsogram(String str) {
      
      boolean isit = true;
      
      char[] arr = new char[str.length()];
      
      for(int i = 0; i < str.length(); i++) {
        
        arr[i] = Character.toLowerCase(str.charAt(i));
      }
      
      for ( int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
          
          if (arr[i] == arr[j]) {
            isit = false;
            break;
          }
          
        }
      }
      
      return isit;
    
    } 
}
