class Perfume{
public static void main(String a[])
{
 String read[]={"Armani","DIOR","mugler","tiffany","laurent"};
 int write[]={200,150,350,150,500};
 System.out.println(read.length);
 showPrice(read,write);
}
 public static void showPrice(String x[], int y[])
  {
   for(int i=0;i<x.length;i++)
   {
    System.out.println(x[i] + " price is " + y[i]);
   }
  }
}
