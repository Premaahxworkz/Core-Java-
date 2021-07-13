class Jam{
public static void main(String a[])
{
 String name[]={"Straberry","loquat","plum","carrot","pepper"};
 int money[]={150,120,90,100,200};
 System.out.println(name.length);
 jamInformation(name,money);
}
 public static void jamInformation(String u[], int v[])
  {
   for(int i=0;i<u.length;i++)
   {
    System.out.println(u[i] + " price is " + v[i]);
   }
  }
}
