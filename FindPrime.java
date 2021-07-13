class FindPrime
{
public static void main(String a[]){
int num=9;
boolean num=false;
System.out.println(num);
usingMethod(num);
}
public static int usingMethod(int save)
{
for(i=2;i<=save/2;i++)
{
if(save % i== 0)
 {
  save = true;
  return save;
 }
}
if(!save)
System.out.println(save+ " is a prime number");
else
System.out.println(save+ " is not a prime number");
}
}