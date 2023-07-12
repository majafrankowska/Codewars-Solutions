
public class Square {    
    public static boolean isSquare(int n) {
      
      int sqrt = (int) Math.sqrt(n);
      
      boolean anwser;
      
      if(n<0) {
        
        return false;
        
      }
      
      anwser = sqrt * sqrt == n;
      
      return anwser;
      
      
    }
}


/*
// second correct version:

public class Square {    
    public static boolean isSquare(int n) { 
      
      int sqrt = (int) Math.sqrt(n);
      
        if (n < 0) {
            return false; 
        }
  
        return sqrt * sqrt == n;
    }
}
*/
