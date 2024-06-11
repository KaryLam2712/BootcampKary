import java.math.BigDecimal;

public class Person {
  
  //attributes 
  private String firstName;
  private String lastName; 
  private double weight; 
  private double height; 

  //Empty Contructor 
  public Person(){

  }
  // All arguments Constructor 
  public Person(String firstname, String lastName, double weight, double height){

  }

  //If no constructor is defined 
  // by default the class implicitly has a empty constructor3
  // attributes Presentation 

public String fullName(){
  return this.firstName+ " " + this.lastName;
}
  //getter setter 
 
  public String getfirstName () {
    return this.firstName; 
  }
  public String getlastName () {
    return this.lastName; 
  }
 
 
  public void setfirstName ( String firstName) {
    this.firstName=firstName;
  }

  public void setlastName (String lastName){
    this.lastName = lastName;
  }
  
  public void setWeight ( Double setWeight) {
    this.weight;
  }
  public double getWeight(){
    return this.weight; 
  }

  public double getHeight(){
    return this.;
  }
  //weight / height ^2 ->Big decimal 
  public void setHeight ( Double Height) {
    return this.Height;
   
  public BigDecimal bmi(){
    return = BigDecimal.valueOf(this.weight);
  }
  
 
  public static void main(String[] args) {
    // create a person 

    Person p1 = new Person();
    // set lastname 
    p1.setlastName;
     public static double bmi(double weight, double height){
      return BigDecimal.valueOf(0);
     }
  }

  // to String 
  public String toString(){
    return Person(  + "Name: " + this.fullName()//
    +)
  }
 Person p2 = new Person("Jenny", "Chan", 55, 1.7);
 System.out.println(p2.fullName());
 p2.setWeight(54);

 Person p3 = p1; 
 System.out.println()
}
