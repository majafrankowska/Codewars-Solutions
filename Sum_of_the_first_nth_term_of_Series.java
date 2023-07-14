public class NthSeries {
    public static String seriesSum(int n) {
      
        Double sum = 0.00;
      
        if (n == 0) {
            return String.format("%.2f", sum);
        }
      
        else {
          for (int i = 0; i < n; i++){
            
            sum += Double.valueOf(1) / Double.valueOf(1 + i * 3);
          }
          return String.format("%.2f", sum);
        }
    }
  }
