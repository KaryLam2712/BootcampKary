public class Method {
    public static void main(String[] args) {
       // Method: you put something in the box, and it return something to you 
       // Calling Method 
       System.out.println("hello");
       // Call method (sum)
       int result = sum(10,3);
       System.out.println("result " + result); //13
       System.out.println(lastChar("hello")); //o
       //System.out.println(toStrin(arr));
      // System.out.println(isSubstring("hello", "ll"));
    }

    public static int sum(int x, int y) {
     // if your method is with return type, the method content should contain a keyword "return"
     return x+y; // int+int ->int
    }

    public static char lastChar(String s){
     return s.charAt(s.length() - 1);
    }
    public static String toString(char[]arr){
      String result ="";
      for (int i=0; i<arr.length; i++){
      result += arr[i];
      } 
      return result;

      //Approach 2
      //return String.vauleOf(arr);
      
    }
    public static int max(int[]arr){
        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
        max = arr[i];
        }
       
    }
    return max;
    }

    public static boolean isElderly (int age) {
        // >65 
      if (age>65); {
         return true; }
         //return false; 

         //approach 2
        // return age>65;




    }
    //public static boolean isSubstring(String str , String substr){
        // check if substr is a substring of a str 
        //Approach 1
        //return str.contains(substr);
        // Approach 2 
        // indexof() method returns an int index, which is index position of substring
        //if it return -1 means not exist, 
        //return str.indexOf(substr) !=-1; 

        // Approach 3 
        for (int i=0; i< str.length(); i++);{
            for (int j=0; j< substr.length(); j++);{
                if (str.charAt(i+j) != substr.charAt(j)){
                 break;
                }
                if (j== substr. length()-1){
                    return true;
                }
                }
                }
                
            
            
        }
      
     public static double cicleArea(int radius){

     }

     // Java ->PI
     public static double circleArea(int radius){
        return radius * radius * MAth.PI
     }
    

    
   

