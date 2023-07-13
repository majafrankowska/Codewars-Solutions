
public class DescendingOrder {
  public static int sortDesc(final int num) {
    
    int n = num;
        int count = 0;
        
        while (n > 0) {
            n = n / 10;
            count++;
        }
        
        int[] arr = new int[count];
        n = num;
        
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n = n / 10;
        }
        
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        int number = 0;
        for (int i = 0; i < count; i++) {
            number = number * 10 + arr[i];
        }
        
        return number;
    
  }
}
