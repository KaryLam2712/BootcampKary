public class TestCat {
  public static void main (String[]args){
    // Local variable: things happend in {} only 
    String name = "John";
    Cat c1= new Cat(); // "new Cat()" -> produce cat object in memory 
    // memory address -> 0x123asfnkfdng121
    // c1 -> object reference, variable (), able to find the cat object 
    c1.setAge(10);

    c1.setAge(10);
    System.out.println(c1.getAge());

    Cat c2= new Cat();
    c2.setAge(7);

    System.out.println(c2.getAge());
    System.out.println(c1.getAge());

    Cat c3 = new Cat();
    
    System.out.println(c3.getAge()); // 0 , because the default vaule is 0

    Ball b= new Ball();
    // Ball b -> becuase Ball.class is "public class"
    // New Ball() -> becuase the constructor is public
  }
}
