
public class Clock {
  public static int Past(int h, int m, int s) {
    
    int sum = (s*1000) + (m*1000*60) + (h*1000*60*60);
    
    return sum;
  
  }
}
