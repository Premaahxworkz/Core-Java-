class Chocolates{
public static void main(String a[])
{
 String types[]={"dailry milk","perk","candy","fuse","bournville"};
 int rate[]={180,50,60,80,150};
 System.out.println(types.length);
 showRate(types,rate);
}
 public static void showRate(String t1[], int t2[])
  {
   for(int i=0;i<t1.length;i++)
   {
    System.out.println(t1[i] + " price is " + t2[i]);
   }
  }
}
