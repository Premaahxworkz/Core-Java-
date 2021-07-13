class ProteinShakes{
public static void main(String a[])
{
 String name[]={"A1","B1","C1","D1","E1"};
 int price[]={200,250,150,170,200};
 System.out.println(name.length);
 findPrice(name,price);
}
 public static void findPrice(String h1[], int n1[])
  {
   for(int i=0;i<h1.length;i++)
   {
    System.out.println(h1[i] + " rate is " + n1[i]);
   }
  }
}