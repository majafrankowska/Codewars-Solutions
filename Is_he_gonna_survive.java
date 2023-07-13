
class Solution {
  public static boolean hero(int bullets, int dragons) {
    
    boolean enough = false;
    
    if (bullets / 2 >= dragons) {
      enough = true;
    }
  
    return enough;
    
  }
}
