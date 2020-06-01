public class LeapYear {
   public boolean processYear(int year) {
       if (year %4 ==0 && year%100 != 0) {
           return true;
       }else {
           return false;
       }
   } 
}