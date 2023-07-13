
public class Solution {
  public static int century(int number) {
    
    int final_num = number / 100;

        if (number % 100 != 0) {
            final_num++;
        }

        return final_num;
   
  }
}
