public class App {
    public static void main(String[] args) throws Exception {
    }

    // Method (Tool) length()
    String t = "hello";
    System.out.println("The length of t=" + t.length());  // t.length() => int
  
    //check if t length =4 , if yes print hello, else goodbye
 
    If (t.length() >=4);

 // Method 2 Equal
 String s1="hello";
 String s2="hello";
 if (s1.equals(s2)){
    System.out.println("They are having the same String value");
 } else {
    System.out.println("They are not with the same value");
 }
 if (s1 ==s2) {
    System.out.println("They are same object."); //print
 }

 //check if s1 length >=6 or s1 equal s2, print 

 if (s1.length()>=6 || s1.equals(s2)){ 
    System.out.println("They are having the same String vaule");
 } else {
    System.out.println("...")
    //test the first one first and then test the second sentence
 }
 if (s1.length()>=6) {

 } else if (s1.euqals(s2)){

 }
 if (s1.length()>=6 && s1.equals(s2)){ 
    System.out.println("They are having the same String vaule");
 } else {
    System.out.println("...")
}
if (s1.length()>=6 ){ 
  if (s1.equals(s2)){
    System.out.println("");
  }
  // Method 3 : chatAt(int index), for example, charAt(0)
  String s3 = "world";
  //0 is the frist character, 1 is the second character
  System.out.println("The 1st character of s3="+s3.charAt(0)); //w
  System.out.println("The 5th character of s3="+s3.charAt(4)); //d

  //System.out.println("The 6th character of s3="+s3.charAt(5)); // java.lang.StringIndexOutofBoundsException
  System.out.println("The last character of s3="+s3.charAt(s3.length()-1));

  // check if the last character is d and the length >5, if yes, print yes 
  
  String x2="hello world";

  // char use == (primitive) and use single quote
  if (charAt(x2.length()-1)=='d' && x2.length()>5){ 
    System.out.println("yes");
 } else {
    System.out.println("no");
}

// Method 4 : substring (int beginIndex, int endIndex)
  String result = x2.substring(0,2);
  System.out.println(result);//he 
  System.out.println(x2.substring(0,5)); // hello
  System.out.println(x2.substring(3,8)); // lo wo

 
  //check if the first 3 character is "wel", print yes 
  //Sting need to use equals 
  String x3="welcome";

if (x3.substring(0,3).equals("wel")) {
    System.out.println("yes");
} else{
    System.out.println("no");
}

if ((x3.charAt(0)+x3.charAt(1)+x3.charAt(2)).equals("wel") ){ 
    System.out.println("yes");
 } else {
    System.out.println("no");
}
//chain method 
System.out.println(x3.substring(0,3).length()); // 3
System.out.println(x3.substring(0,3).charAt()); //e

//Or more inconvience 

String x4=x3.substring(0,3);
int l1=x4.length();
System.out.println(l1);//3
//charAt()
if(x3.charAt(0) =='w' && x3.charAt(1) == 'e' && x3.charAt(2) =='l'){
    System.out.println("yes");
}

}