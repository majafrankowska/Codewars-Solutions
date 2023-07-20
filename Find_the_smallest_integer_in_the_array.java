public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
      
      int smallest = args[0];
      
      for (int i = 1; i<args.length; i++){
        if(smallest>args[i]){
          smallest=args[i];
        }
      }
      
      return smallest;

    }
}
