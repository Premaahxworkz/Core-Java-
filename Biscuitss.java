aclass Biscuitss{
public static void main(String a[])
{
 String names[]={"Parle-G","monacco","hide and seek","marigold","Oreo"};
 int price[]={10,5,30,120,50};
 System.out.println(names.length);
 displayBiscuitPrice(names,price);
}
 public static void displayBiscuitPrice(String a[], int b[])
  {
   for(int i=0;i<a.length;i++)
   {
    System.out.println(a[i] + " amount is " + b[i]);
   }
  }
}
