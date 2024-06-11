import java.math.BigDecimal;

public class DemoBigDecimal {
  public static void main (String[]args) {
   double x = 0.2; 
   double y = 0.1; 
   System.out.println(x*y);
   

   BigDecimal b1 = new BigDecimal("0.2");
   BigDecimal b2 = new BigDecimal("0.1"); 

   BigDecimal b3 = b1.multiply(b2);
   System.out.println(b3.doubleValue()); 
  
   //Divide 
   // method
   System.out.println(divide(9.9, 3.0));
   System.out.println(divide(9.9, 3.2));
   System.out.println(divide(10,3));
  
   //d1.substract().multipy()

   System.out.println(BigDecimal.valueOf(3.3))
   
   
   double x1 = 5.0;
   double x2 = 6.0; 
   System.out.println(x1/x2);
   BigDecimal b4 = new BigDecimal("5.0");
   BigDecimal b5 = new BigDecimal("6.0"); 
   BigDecimal b6 = b4.divide(b5);
   System.out.println(b6.doubleValue()); 
  }


  




  public static double sum(double d1, double d2){
    BigDecimal b1 = BigDecimal.valueOf(d1);
    BigDecimal b2 = BigDecimal.valueOf(d2);
    return b1.add(b2).doubleValue();



  }

  public static double sum (double d1, double d2) {
  BigDecimal b1 = BigDecimal.valueOf(d1);
  BigDecimal b2 = BigDecimal.valueOf(d2);
  return b1.add(b2).doubleValue();
  }

  //public static double divide(double d1, double d2) {
    //return BigDecimal.valueOf(d1).divide(BigDecimal.valueOf(d2), RoundingMode.UP);
   // .setScale(3, RoundingMode.UP)
   //.doubleVaule()
  }

