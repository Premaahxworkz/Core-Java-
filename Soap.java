class Soap{
public static void main(String a[])
{
 String name[]={"life-buoy","mysore sandal","dettol","lux","pears"};
 int year[]={2000,1916,1932,1925,1789};
 System.out.println(name.length);
 soapInvented(name,year);
}
 public static void soapInvented(String a1[], int b1[])
  {
   for(int i=0;i<a1.length;i++)
   {
    System.out.println(a1[i] + " soap is invented in " + b1[i]);
   }
  }
}