public class DemoInteger {

  public static void main(String[] args) {
    
  Integer i1 = Integer.valueOf(3);
  Integer i2 = 3; // 3 int vaule ->autobox->integer object (heap memory)

   // Internal Cache (For Number)

  i1=127; // (object ref) , 127 -> 1st create integer object 
  i2=127; // (object ref) , 127 -> 2nd reuse the orignial integer object 
  // from -128 to 127 -> reuse the original object 

  System.out.println(i1==i2); // true (are they the smae object?)

  Integer i3= 128; //-> 1 st create Integer Object 
  Integer i4=128; // -> 2 nd create Integer Object 
  System.out.println(i3==i4); // false (are they the same object?)

  // important 
  // For class, you should always compare their object vaule by Methods 
  
 }
}
