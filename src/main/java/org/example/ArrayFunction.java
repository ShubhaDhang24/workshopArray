package org.example;

public class ArrayFunction {
    public static void main(String[] args) {
        //declaration and initialization of string
        String a1[]= {"Erik Sve","Milia Peter","Shubha D"};
        arrayPrint(a1);

    }
        public static  void arrayPrint(String[] a1)
        {
            for(int i=0;i< a1.length;i++)
            {
                System.out.println(a1[i]);
            }

        }

}
