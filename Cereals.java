class Cereals{
public static void main(String a[])
{
 String name[]={"Wheat","Rye","Rice","Oats","maize"};
 int amount[]={100,50,38,40,60};
 System.out.println(name.length);
 cerealsinfo(name,amount);
}
 public static void cerealsinfo(String p[], int q[])
  {
   for(int i=0;i<p.length;i++)
   {
    System.out.println(p[i] + " amount is " + q[i]);
   }
  }
}
