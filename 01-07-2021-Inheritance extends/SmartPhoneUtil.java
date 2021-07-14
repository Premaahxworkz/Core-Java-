import java.util.Scanner;
class SmartPhoneUtil
{
public static void main(String a[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter color");
String phoneColor=scan.next();
System.out.println("Enter price");
double price=scan.nextDouble();
Iphone phone=new Iphone();
scan.close();
phone.phoneColor=phoneColor;
phone.price=price;
System.out.println(phoneColor+" "+price);
}
}