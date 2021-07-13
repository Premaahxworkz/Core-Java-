class IceCream{
public static void main(String a[])
{
 String names[]={"Vanilla","candy","cone"};
 String shapes[]={"round","square","tringle"};
 System.out.println(names.length);
 iceCreamDetails(names,shapes);
}
 public static void iceCreamDetails(String ice[], String shapee[])
  {
   for(int i=0;i<ice.length;i++)
   {
    System.out.println(ice[i] + " is having " + shapee[i] + " shape");
   }
  }
}