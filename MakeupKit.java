class MakeupKit
{
static byte count = 1;//-128 to +127 1 byte
static short code =30234;//-32,768 to 32,767 
static int price = 500;//whole number
static long barcode = 564352712374L;
static float width = 2.3f;
static double size = 3.4d;
static char type = 'A';//only 1 char, or no
public static void main(String a[]){
System.out.println(count);
System.out.println(price);
System.out.println(barcode);
System.out.println(width);
System.out.println(size);
System.out.println(type);
System.out.println(code);
}
}