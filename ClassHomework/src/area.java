public class area {
    
    private double width;
    private double height; 

    public void setWidth(double width) {
        this.width = width;
      }
      public void setHeight(double height) {
        this.height = height;
      }

      public double getWidth() {
        return this.width;
      }

      public double getHeight() {
        return this.height;
      }

      public double calculateArea() {
        return width * height;
    }
       
    
    public static void main(String[] args){
        
        area rectangle = new area();
        rectangle.setWidth(5);
        rectangle.setHeight(8);

        double area = rectangle.calculateArea();
        System.out.println("The area is " + area); 

    }
}
