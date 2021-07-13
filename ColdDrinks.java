class ColdDrinks{
public static void main(String a[])
{
 String drinks[]={"coco-cola","pepsi","limca","fanta"};
 int price[]={54,30,40,20};
 System.out.println(drinks.length);
 calculate(drinks,price);
}
 public static void calculate(String b1[], int c1[])
  {
   for(int i=0;i<b1.length;i++)
   {
    System.out.println(b1[i] + " rate is " + c1[i]);
   }
  }
}