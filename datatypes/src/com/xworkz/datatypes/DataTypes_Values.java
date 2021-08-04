package com.xworkz.datatypes;

public class DataTypes_Values {
	byte b=127; 
	short s=32000;
	int i=100020;
	long l=1658790l;
	float f=86.986658765f;//displaying  5 values after decimal
	double d=787.098647697866658d;//displaying 13 values after dec point
	boolean bn=true;
	char c='c';
	String st="anything";

	public static void main(String[] args) {
	DataTypes_Values values = new DataTypes_Values();//creating obj to access non static data members
	System.out.println(values.b);
	System.out.println(values.s);
	System.out.println(values.i);
	System.out.println(values.l);
	System.out.println(values.f);
	System.out.println(values.d);
	System.out.println(values.bn);
	System.out.println(values.c);
	System.out.println(values.st);

			 }
					
	}
