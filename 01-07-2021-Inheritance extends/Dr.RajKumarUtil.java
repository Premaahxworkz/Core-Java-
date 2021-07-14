import java.util.Scanner;
class Dr.RajKumarUtil
{
public static void main(String a[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the actor's language");
String language=scan.next();
System.out.println("enter the NumOf Pictures they acted");
int numOfFilms=scan.nextInt();
Dr.RajKumar kumar=new Dr.RajKumar();
kumar.language=language;
kumar.numOfFilms=numOfFilms;
System.out.println(kumar.language +" " +kumar.numOfFilms);
}
}