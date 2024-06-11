public class DemoInteger {
    public static void main(String[] args)  {
        int x=1; 
        Integer x2=1;
        System.out.println(x);
        System.out.println(x2);

        x = x+3;
        x -= 10;

        x2 = x2+3;
        x2 -= 10;

        //Integer is a wrapper class 
        //Class has method 
        short s =(short)x; 
        x2 += 60000;
        short s2= x2.shortValue(); // overflow, similar to explict conversion 
        System.out.println(s2);

        
        double d1 = x2.doubleValue();
        System.out.println(d1);

        // Comparison (>,<,>=,<=,==,!= not for Integer, they are for primitive vaule only )
        //For Integer (wrapper class comparision), compareTo()
        Integer x3=4;
        Integer x4=8;
        Integer x5=8;
        boolean result = x4 >x3; // true (compare int vaule)

        System.out.println(x4.compareTo(x3));//1
        System.out.println(x3.compareTo(x4));//-1
        System.out.println(x4.compareTo(x5));//0

        boolean resulr2= x4.compareTo(x3)>0; // true, comapre integer vaule 
        boolean resulr3= x4.compareTo(x3)<0; // f
        boolean resulr4= x4.compareTo(x5)==0;// t

        //Double, Byte, Short, Float, Long 

        Float f1= 10.0f;// 10.0 is a double //10.0f is a float vaule -> autobox -> float vaule 
        Float f2= new Float(10.0f); // create Float object , storing a float vaule 
        longl2= f2.longValue();

        double d3 = new Double("10.3");
        long l3 = d3.longVaule(); 
        System.out.println(l3); //10 

        Character c1 = new Character('a');
        char c2 = Character.toUpperCase('b'); 
        System.out.println(c2); // 'B'
        System.out.println(Character.toLowerCase('M')); //m

        Boolean b3 = new Boolean(false);
        Boolean b4 = new Boolean(true);
        Boolean b5 = new Boolean(true);
        System.out.println(b3.compareTo(b4)); //-1 
        System.out.println(b5.compareTo(b4)); //0
        //compareTo() method is used to compare the boolean value stored in Boolean object.

        System.out.println(b3 == b4); //false
        System.out.println(b3 == b4); //false????

        //autobox and unbox 
        Integer i7 = 9; // 9 is an int vaule -> autobox ->Integer object 
        int i8=i7; //i7 is Integer object -> unbox -> int value 

        Integer i9 = new Integer(9);
        int i10= i9.intValue();

        Integer i11 = Integer.valueOf(9); // static method, the result is as same as "new Integer(9)"
        
        int i12 = Integer.parseInt("10");
        System.out.println(i12); // 10

        int i13 = Integer.parseInt("10a");  // Execption 
        System.out.println(i13);

        System.out.println(new Byte("10"));
        System.out.println(new Byte((byte)10));






    }
}
