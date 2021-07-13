class Addition{
public static void main(String a[])
{
int num = add(23,45);
System.out.println(num);
add(34,56,56);
}
public static int add(int x,int y)
{
return x+y;
}
static void add(int x, int y, int z)
{
int c=x+y+z;
System.out.println(c);
}
}
