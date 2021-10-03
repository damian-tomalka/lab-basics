package pl.edu.wszib.lab1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MyTypes {
    public static int myInt;
    public static Integer myInteger;

    public static void main(String[] args) {
        System.out.println("MyInt " + myInt);
        //autoboxing
        Integer myLocalInteger = myInt;
        //int myLocalInt = myInteger; //autounboxing => myInteger.intValue() causes nullPointerException!
        int myLocalInt1 = 100000;
        long myLocalLong = 100_000_000_000L;
        myLocalLong = myLocalInt1;
        // myLocalInt1 = (int) myLocalLong;
        double a = 123.9595;
        float b = 123.9595f;
        new BigInteger("10000000000000000000000000000");

    }

}
