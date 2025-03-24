package buoi11;

import java.math.BigDecimal;
import java.math.BigInteger;

public class hw02 {
    public static void main (String[] args){
        // method equals
        String opject1 = " keudz1";
        String opject2 = " keudz1";
        String opject3 = " keudz3";
        System.out.println(opject1.equals(opject2));
        System.out.println(opject1.equals(opject3));

        //toString()
        System.out.println(opject1.toString());
        // method wrapper
       String opject4 = "8386";
       int value = Integer.parseInt(opject4);
       System.out.println(value + 4);
       //Stringbuilder
        StringBuilder string = new StringBuilder("hulihaha");
        string.append("hahacc");
        string.insert( 8, " ");
        System.out.println(string);
        //Biginteger
        BigInteger integer = new BigInteger("111111111111111111111111111111111111111111111111111111111111111111");
        System.out.println(integer.add(integer));
        System.out.println(integer.subtract(integer));
        System.out.println(integer.multiply(integer));
        System.out.println(integer.divide(integer));
       //Bigdecimal
        BigDecimal double1 = new BigDecimal("123213.3445678976543213456786543245678654323456786543245678");
        System.out.println(double1.add(double1));
        System.out.println(double1.subtract(double1));
        System.out.println(double1.multiply(double1));
        System.out.println(double1.divide( double1));

    }
}
