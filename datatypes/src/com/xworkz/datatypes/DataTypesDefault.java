package com.xworkz.datatypes;

public class DataTypesDefault {
	 static byte b; 
	 static short s;
	 static int i;
	 static long l;
	 static float f;
	 static double d;
	 static  boolean bn;
	 static char c;
	 static String st;
	 public static void main(String[] args) {
			
	System.out.println(b);//cannot call non static data member into static method
	System.out.println(s);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
	System.out.println(bn);//for boolean its always false
	System.out.println(c);//default val for character is space
	System.out.println(st);

		}

	}
