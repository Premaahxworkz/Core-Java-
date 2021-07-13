class VegAndFruits{
public static void main(String a[])
{
 String veg[]={"potato","carrot","cucumber","mango","apple"};
 int price[]={40,30,27,59,60};
 System.out.println(veg.length);
 displayVegPrice(veg,price);
}
 public static void displayVegPrice(String veggie[], int prices[])
  {
   for(int i=0;i<veggie.length;i++)
   {
    System.out.println(veggie[i] + " price is " + prices[i]);
   }
  }
}
