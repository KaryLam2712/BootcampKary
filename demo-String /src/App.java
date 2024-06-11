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

//
String x6 = x3.substring(0,3); // "wel"
System.out.println(x6.length()); // 3 

//Or more inconvience 

String x4=x3.substring(0,3);
int l1=x4.length();
System.out.println(l1);//3
//charAt()
if(x3.charAt(0) =='w' && x3.charAt(1) == 'e' && x3.charAt(2) =='l'){
    System.out.println("yes");
}
// isEmpty()
//Empty String vaule -> ""
String x7 =""; 
System.out.println(x7.isEmpty()); // true
String x8= "abc"; 
System.out.println(x8.isEmpty()); // false 
System.out.println(x7.length()==0);// true

//isBlank()
String x9= "";
System.out.println(x9.isBlank()); // true 
x9= "";
System.out.println(x9.isBlank()); // true
System.out.println(x9.isBlank()); // false

//substring (0,3)
//substring (0)
String s10="hello";
System.out.println(s10.substring(0)); // hello, from index 0 to the end.
System.out.println(s10.substring(0,3));//hel, from index 0 to the index 2 (3-1)

//hello ->HELLO
System.out.println(s10.toUpperCase()); // "HELLO"
String s11="Hello"; 
System.out.println(s11.toLowerCase());

System.out.println(s10.replace('l','x')); // hexxo
System.out.println(s10.replace("ll", "yyyy")); //heyyyyo

System.out.println(s10.contains("ell")); // true 

//startWith()
System.out.println(s10.startWith("he")); // true 
//endwith()
System.out.println(s10.endWith("o")); // true

//trim() removing the space characters at the head/tail of the strings 
String s12= "    Hello,   bottcamp  !!!"; 
System.out.println(s12.trim()); //  Hello,  bootcamp !!!


//EX 
String[] strings=new String[]{"hello", "abcijk", "vincent", "Hello", "    HELLO"}; 
// how many string contains "ELL", ignore case 
//to Uppercase(), Contains()
//System.out.println(toUppercase());
 
int count=0;
for (int i=0; i<strings.length; i++){
 if(strings[i].toUpperCase().contains("ELL")){
    count++;
 }
}

 System.out.println(count);

 // equalsIgnoreCase()
 for (int i=0; i<strings.length; i++){
   if (strings[i].trim().equalsIgnoreCase("hello")){
      System.out.println(strings[i]);
   }
 }

 String s13="hello";
 System.out.println(s13.indexOf("ll"));//2, the first pattern 
 System.out.println(s13.indexOf('e'));//1
 System.out.println(s13.indexOf('l'));//2, the first character of 'l'
 System.out.println(s13.indexOf("ll", 4)); //5
 System.out.println(s13.indexOf("ll", 6)); // -1
 System.out.println(s13.indexOf(101)); //1, ascii 'e' ->101

 System.out.println(s13.lastIndexOf("ll")); //5, the last occurance of the pattern 
 System.out.println(s13.lastIndexOf('e'));

 String s14 = "abc";
 s14 += "def";
 System.out.println(s14);//abcdef

String s15="abc";
s15 = s15.concat("def"); //better performance 
System.out.println(s15); // abcdef 

String s16="abc";
String s17="abc";

System.out.println(s16.compareTo(s17)); //0, the vaule of s14= the vaule of s25 
System.out.println(s16.equals(s17)); //true 

//System.out.println(s16 ==s17); // comparing the string object address 




}

}