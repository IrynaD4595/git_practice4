package day6_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        //       short b = (short)a
        //
        int c = b; //                implicit casting
        // int c = (int)b

        long d = c;
        // (long)c

        float e = d;
        double f = e;
        System.out.println("__________________________________________________");

        int x =55;
        short y = (short)x;           //explicit casting

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short)j;
        System.out.println(j+" : "+k);

        double l = 2.5;
        float m = (float)l;

        System.out.println(l+" : "+m);

        double n = 10.8;
        int s = (int)n;
        System.out.println(n+ " : "+s);

        double d1 = 20.5;
        short s1 = (short) d1;    //shortcut

        System.out.println(d1 +" : "+ s1);








    }





}
