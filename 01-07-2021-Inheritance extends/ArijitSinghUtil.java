import java.util.Scanner;
class ArijitSinghUtil
{
public static void main(String a[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter number of songs");
int numOfSongs=scan.nextInt();
System.out.println("Enter the singers origin");
String isFrom=scan.next();
ArijitSingh singh=new ArijitSingh();
singh.numOfSongs=numOfSongs;
singh.isFrom=isFrom;
System.out.println(numOfSongs+" "+isFrom);
}
}