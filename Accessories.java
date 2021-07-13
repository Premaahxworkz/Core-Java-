class Accessories{
public static void main(String a[])
{
 String names[]={"mobile","charger","usb","socket"};
 int amount[]={15000,500,250,300};
 System.out.println(names.length);
 info(names,amount);
}
 public static void info(String acc[], int rs[])
  {
   for(int i=0;i<acc.length;i++)
   {
    System.out.println(acc[i] + " is having amount " + rs[i]);
   }
  }
}