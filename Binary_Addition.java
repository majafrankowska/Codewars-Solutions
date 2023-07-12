
public class Kata{
  
  public static String binaryAddition(int a, int b){
    
    int sum = a+b;
    String my_binary = "";
  
    int n = sum;
    int count = 0;
    
    while (n>0) {
      
      n = n/2;
      count++;
      
    }
    
    n = sum;
    
    int [] arr = new int [count];
    
    for (int i = count - 1; i >=0 ; i--){
      
      arr[i] = n % 2;
      
      n = n/2;
      
    }
    
    for (int i = 0; i<arr.length; i++){
      
      my_binary += arr[i];
      
    }
    
    return my_binary;
    
  }
}
