import java.util.Scanner;
class MaggieUtil
{
public static void main(String a[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the food id");
int foodId=scan.nextInt();
System.out.println("Enter food Type");
String foodType=scan.next();
System.out.println("Enter food price");
double price=scan.nextDouble();
Maggie mag=new Maggie();
mag.foodId=foodId;
mag.foodType=foodType;
mag.price=price;
System.out.println(mag.foodId+" "+mag.foodType+" "+mag.price);
}
}
