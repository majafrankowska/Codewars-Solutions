
public class Solution {

    public static boolean check(Object[] a, Object x) {
      
      boolean isit = false;
        
      for (int i = 0; i<a.length; i++) {
        
        if (a[i] == x) {
          isit = true;
          break;
          
        }   
      }
      
      return isit == true;
      
    }
}
