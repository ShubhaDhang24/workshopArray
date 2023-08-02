package org.example;

public class ArrayFunction {
    public static void main(String[] args) {
        //declaration and initialization of string
        String a1[] = {"Erik Sve", "Milia Peter", "Shubha D"};
        arrayPrint(a1);

    }

    public static void arrayPrint(String[] a1) {
        for (String i : a1) {
            System.out.println(i);
        }
    }
}
