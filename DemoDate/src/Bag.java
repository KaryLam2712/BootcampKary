import java.lang.reflect.Array;
import java.util.Arrays;

public class Bag {
  private int[] integers;
  
  //constructor
  public Bag(){
   
  }
  public Bag(int[] integers){
    this.integers = integers;
  }
   // getter setter 
   public int[] getIntergers(){
    return this.integers;
   }

  public void setInterger (int[] integers ){
    this.integers = integers;
  }

  // to String 
  public String toString () {
    return "Bags (" 
    +"Intergers=" + Arrays.toString(this.integers) + ")";
  }

  public static void main(String[] args) {
    int[] integers = new int[] {3,1,2};
    Bag b1 = new Bag(integers);
    System.out.println(b1.toString());

    //Bag integers = {100,-2,6}
    System.out.println(new Bag(new int[] {100,-2,6}).toString());
  }

   
  String s= "String";
   s.charAt(0);
  
}
