public class DemoMath {
    public static void main(String[] args) {
        
        //abs()
        int x = -3;
        int y= 0; 
        int result = Math.abs(x*y);// int*int ->int
        System.out.println(result);
        double d = 3.3d;
        double result2 = Math.abs(d*x); // double * int ->double 
        System.out.println(result2);

        long l= 9L;
        long result3 = Math.abs(l*x);
        System.out.println(result3);

        //max()
        System.out.println(Math.max(10,9));
        System.out.println(Math.min(-10,9));

        int[]arr = new int[] {4-3,10,2};
        int max=Integer.MAX_VALUE;
        for (int i=0; i< arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);//10

        //round 
        double d1 = 3.65d;
        System.out.println(Math.round (d1)); // 
        System.out.println(Math.round (3.4));
        System.out.println(Math.round (3.5));
        System.out.println(Math.round (3.45));
        System.out.println(Math.round (3.44));

        // pow()
        double r4= Math.pow(2,3);
        System.out.println(Math.pow(2.2,3));
       
       //sqrt()
        double d2 =Math.sqrt(25);
        System.out.println(Math.sqrt(d2));//4.898979...
        System.out.println(Math.sqrt(-26));//NaN
       
        //random()
        System.out.println(Math.random()); // 0.153444
        System.out.println(Math.round(Math.random()));

        
    }
}
