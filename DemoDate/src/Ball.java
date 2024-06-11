public class Ball {
  
  private String color; //char[]
  private double weight;  

// contructors -empty comtructor , all args contructor 
// by default, there is empty contructor implicitly exist in the class 
//public ball {

//}

  //Custom empty contructor 
  public Ball(){
    this.color="Red";
   }

   public Ball(double weight, String color){
   this.weight=weight;
   this.color=color; 
  }

  public void setWeight (double weight ){
    this.weight = weight; 
  }

  public void setColor (String color) {
    this.color = color;
  }

  // to String 
  public String toString () {
    return "Ball" //
    + "weight" + this.weight
    + "color" + this.color
  }

  public Ball(double color, String weight){
    this.weight= weight;
    this.color= color;
  }
}
