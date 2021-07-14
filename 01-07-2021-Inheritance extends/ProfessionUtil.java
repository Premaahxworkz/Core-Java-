import java.util.Scanner;
class ProfessionUtil
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter experience");
float experience=sc.nextFloat();
System.out.println("Enter Expert in...");
String expertIn=sc.next();
System.out.println("Is retired?");
boolean isRetired=sc.nextBoolean();
Teaching teach=new Teaching();
teach.experience=experience;
teach.expertIn=expertIn;
teach.isRetired=isRetired;
System.out.println(experience+ " " + expertIn+ " " +isRetired);
}
} 


