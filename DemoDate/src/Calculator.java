public class Calculator {
  


  // static method -> instance method 

  public static int sum( int x, int y){
    return x+y;
  }
  
  private int number;
  private int sum; 
  
  public void setNumber( int x) {
    this.number = x; 
  }
  
  public void getSum(int y){
    this.sum = y; 
  }


  
  
  public static void test(String[]args){
  //for loop
    for(int i=0; i<args.length; i++){
   System.out.println(args[i]);
    }
  }

  public static void test2(String...args){
    //for each 
    for (String s :args){
    System.out.println(s);
    }
  }
  
  public static void main(String[] args) {
    
    // sysout 
    // stactic methods 
    
    sum(1,3); //4 
    Calculator.sum(2, 3); 

    public int getSum(){
      return this.number + this.sum;
     }
   
    Number n1= new Number();
    n1.setNumber(10);

    Number n2= new Number();
    n2.setNumber(8);

 // Method overloading 
 sum(1,2); // 3
 // becuase you passing int vaule, so "overloading " dertemine 
 // sum (int x, int y) should be call 

 sum(1.0,2.0); //3.0
 // sum(double + double) is called 

 sum(1.0f, 2.0f);
 // upcast 
 // sum ( float x, double y) is called 
   
   

  }


}
