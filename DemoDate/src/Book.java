public class Book {
  
  private String name; 
  private int BookNo; 
  private char FirstCharacter; 

  public void setName ( String x) {
    this.name = x; 
  }

  public void setBookNo (int x){
    this.BookNo = x;
  }

  public void setFirstCharacter (char x){
    this.setFirstCharacter(x);
  }

  public int getBookNo(){
    return this.BookNo;
   }
   
   // static method 
   public static String hello(){
    return "hello";
   }

  

    public static void main (String[]args){
  
      String name = "Harry Potter";
        Book b1= new Book();
    
        b1.setBookNo(1009334);
        System.out.println(b1.getBookNo());
    Book.hello();
    System.out.println("hello");
  }
   // void: no nedd to return 
   // instance method (Object method )vs static method 
   // static method belong to Class , the purpose of static method -> produce something by the input parameters
   // Instance method belong to objects 
   // how to call describe()
   // instance method is able to access ( read and write ) the object attributes
   // static  method should not access any object attributes/ behaviour

}




