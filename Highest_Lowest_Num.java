
public class Solution {
  public static String highAndLow(String numbers) {
    
    String[] numberArr = numbers.split(" ");
    int lowestNum = Integer.parseInt(numberArr[0]);
    int highestNum = Integer.parseInt(numberArr[0]);

    for (int i = 1; i < numberArr.length; i++) {
        int currentNum = Integer.parseInt(numberArr[i]);

        if (currentNum < lowestNum) {
            lowestNum = currentNum;
        }
        if (currentNum > highestNum) {
            highestNum = currentNum;
        }
    }


    String result = highestNum + " " + lowestNum;
    return result;
    
  }
}
