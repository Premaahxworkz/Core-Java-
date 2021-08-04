package com.xworkz.exceptions;

public class NullPointException {
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		try {
		String str=null;
		String str1="okk";
		System.out.println(str.equals(str1));
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("main method ended");
	}

}
