import java.util.Arrays;

public class App {
    public static void main(String[] args) {
   int x1 = 10; 
   int x2 = 20;
   int x3 = -3; 

   //When you create an array object, you have to define the length of it
   int[]arr = new int[3]; 
   // arr[index]
   arr[0] = 10; 
   arr[1] = 20;
   arr[2] = -3;

   //compile time exception
   // arr[0]="hello";
   System.out.println(arr[0]); 
   System.out.println(arr[1]);
   System.out.println(arr[2]);
   arr[1] = 100;
   System.out.println(arr[1]);
   //Run time exception 
   //arr[4]=200;// only 3 index , out of bound 

   int[] arr2 = new int[] {10,20,-3};
   System.out.println(arr[0]); 
   System.out.println(arr[1]);
   System.out.println(arr[2]);

   // String array -> "hello", "abc", "ijk"
   // print all 3 string values 

   String []strings = new String [] {"hello","abc","ijk"};
   System.out.println(strings[0]); 
   System.out.println(strings[1]);
   System.out.println(strings[2]);

   byte[] bytes= new byte[] {2,3,4};
   long[] values=new long[]{2,3,4};
   double[] d1= new double[]{2,4,4};

   //Arrays
  System.out.println(Arrays.toString (strings));// [hello, abc,ijk]
  System.out.println(Arrays.toString (arr2));// [10,20,-3]

   //9,-3,-100,90,66,-4
   // for loop, print out all
   int[] arr3 = new int[] {9,-3,-100,90,66,-4};
   for (int i=0;i<arr3.length; i++){
    System.out.println(arr3[i]);
   }
   //loop
   //find the max vaule loop 3
   
   int max = Integer.MIN_VALUE; // the min value of int
   for (int i=0;i<arr3.length; i++){
   if (arr3[i]>max){
    max= arr3[i];
   }
   }
   System.out.println("max=" + max);

   //find the min vaule from arr3

   int min= Integer.MAX_VALUE;
   for (int i=0; i<arr3.length; i++){
    if (arr3[i]<max){
        min=arr3[i];
   }
   }
   System.out.println("min"+ min);
    
   // 
   char[] arr4= new char[]{'l','e','e','r','q'};
   // q1.count no.e
    int count=0;
      for (int i=0; i<arr4.length; i++) {
        if (arr4[i] == 'e'){
            count++;
        }
    }
    System.out.println("The number of e =" + count);
   
    // q2. boolean result to store if 'r' exist
   boolean isRexist= false;
   for (int i=0; i<arr4.length; i++){
    if (arr4[i]=='r'){
   isRexist=true;
   break;
    }
   }
   System.out.println("Does 'r exist?" + isRexist);
   
    // q3. String result to store "qreel"
    String s = "";
    for (int i= arr4.length -1; i>=0; i--){
    s+= arr4[i];
    
    System.out.println("Reversed char[] =" + s);

    
    // 4 given 2 char[], result -> append all characters to a string value
    char[] c1 = new char[] {'o', 'a', 'k', 'p'};
    char[] c2 = new char [] {'a', 'b', 'f', 't'};
    // 4a result -> "oakpabft" append all character to a string vaule 
    String result1 = "";
    for (int i=0; i< c1.length; i++){
        result1 += c1[i]; // String vaule + char ->String 
    }
    

    //4b result -> "obkta" when even index, get the vaule from c1, when odd index, get the vaule from 
    //if (c1.length>c2.length){
    //length = c1.length;
    //} else {
    //length = c2.length;
    // }
   
    // new ex: Output: obkta
    char[] c3 = new char[] {'o', 'a', 'k', 'p'};
    char[] c4 = new char [] {'a', 'b', 'f', 't'};
    
    //for (int i=0; i<length; i++);
    //if (i%2 ==0 && i <c3.length){
    result2 += c3[i];
    }


}
}

