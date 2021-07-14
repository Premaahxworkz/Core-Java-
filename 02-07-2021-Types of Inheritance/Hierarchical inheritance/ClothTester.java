import java.util.Scanner;
class ClothTester
{
public static void main(String a[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the type of cloth");
String type=scan.next();
System.out.println("Enter the price");
double price=scan.nextDouble();
Cotton co=new Cotton();
Synthetic synt=new Synthetic();

co.stiching();
co.neatness();
synt.noIronRequired();
}
}