public class Kata{
  public static double find_average(int[] array){
    
    int sum = 0;
    int count = 0;
    double anwser = 0.0;
    
    for (int num : array){
      sum += num;
      count++;
    }
    
    anwser = (double) sum / count;
    
    return anwser;
  }
}
