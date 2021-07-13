class ModulasTwoNum
{
public static void mod(int a,int b)
 {
  System.out.println("mod method started");
  int save = a%b;
  System.out.println(save);
  System.out.println("mod method ended");
 }
public static void main(String a[])
{
System.out.println("Main method started");
 mod(200,20);
System.out.println("Main method ended");
}
}
