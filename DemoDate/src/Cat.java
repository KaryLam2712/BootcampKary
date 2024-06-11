public class Cat { //Class name -> NAme Convention -> able to describe physical object
  //state 
  //attributes 
  
  private String name;
  private int age ; 

  // behaviour 
  // instance method 
  // setAge() is a method that can be called by oject only 
  // For example , Cat c1=new Cat(); 
  // c1.setage(13);
  // "this" -> the onject pointed by c1 ( object reference)
  
   // instance method 
   public String describe(){
    return "The age of this cat is "+ this.age +" and name of this cat is"; 
   }



   public void setAge ( int x) {
     this.age = x; 
   }
   public void setName(String x){
     this.name =x; 
   }

   public int getAge(){
    return this.age;
   }
   
   public String getName(){
    return this.name;
  }
}


