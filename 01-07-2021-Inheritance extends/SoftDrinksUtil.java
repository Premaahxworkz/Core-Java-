import java.util.Scanner;
class SoftDrinksUtil
{
public static void main(String a[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter Name");
String name=scan.next();
System.out.println("Enter id");
int id=scan.nextInt();
CocaCola coc=new CocaCola();
coc.name=name;
coc.id=id;
System.out.println(coc.id+" "+coc.name);
}
}



