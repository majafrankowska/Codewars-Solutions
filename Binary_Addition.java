
public class Kata{
  
  public static String binaryAddition(int a, int b){
    
    int n = a + b;
    int sum = n;
    String anwser = "";
    int count = 0;
    
    while(sum>0) {
      sum = sum / 2;
      count++;
    }
    
    int[] arr = new int[count];
    
    for (int i = count - 1; i>=0; i--) {
    arr[i] = n%2;
    n = n / 2;
    }
    
    for( int i = 0; i < arr.length; i++) {
      anwser += arr[i];
    }
   
    return anwser;
    
  }
}
