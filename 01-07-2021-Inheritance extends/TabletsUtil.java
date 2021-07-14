import java.util.Scanner;
class TabletsUtil
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Tablet name");
String name=sc.next();
System.out.println("Enter Tablet mfdDate");
String mfdDate=sc.next();
System.out.println("Enter Tablet expDate");
String expDate=sc.next();
Tablets tab=new Tablets();
tab.name=name;
tab.mfdDate=mfdDate;
tab.expDate=expDate;
System.out.println("about tablet "+name+" "+mfdDate+" "+expDate);
}
}
