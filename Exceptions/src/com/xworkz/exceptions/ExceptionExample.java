package com.xworkz.exceptions;

public class ExceptionExample {
	static String movies[]=new String[3];
    public static void main(String args[]) {
    	System.out.println("The main methd started");
    	try {
    	int a=80;
    	int b=0;
    	System.out.println(a/b);
    	}catch(ArithmeticException ae) {
    		System.out.println("cannot divide numerby zero");
    		ae.printStackTrace();
    	}
    	System.out.println("the main method ended");
    }

}
