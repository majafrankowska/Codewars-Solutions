public class Alarm {
  
  public static boolean setAlarm(boolean employed, boolean vacation) {
    
    if (employed == true){
      if (vacation == true) {
        return false;
      }
      else if (vacation == false){
        return true;
      }
    }
    
    else {
      if (vacation == true){
        return false;
      }
      else if (vacation == false){
        return false;
      }
    }
    
    return false;
  
  }
}
