class CookingOil{
public static void main(String a[])
{
 String oil[]={"Ruchi-gold","SunFlower","oliveOil","Fortune"};
 int price[]={130,120,150,170};
 System.out.println(oil.length);
 findPrice(oil,price);
}
 public static void findPrice(String x1[], int y1[])
  {
   for(int i=0;i<x1.length;i++)
   {
    System.out.println(x1[i] + " rate is " + y1[i]);
   }
  }
}