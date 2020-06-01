public class LeapYear {
   public boolean processYear(int year) {
       if (isDivisableBy4(year) && isNotDivisableBy100(year)) {
           return true;
       }else if (isDivisableBy4(year) & isDivisableBy100And400(year)) {
           return true;
       } else if (isDivisableBy4(year)){
           return true;
       } else{
           return false;
       }
   } 

   //methods
   public boolean isDivisableBy4(int year) {
       return year % 4 == 0;
   }

   public boolean isNotDivisableBy100(int year){
       return year%100 !=0;
   }

   public boolean isDivisableBy100And400(int year){
       return year%100==0 && year%400 ==0;
   }
}