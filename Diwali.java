class Diwali extends Festival
{
@Override
public void celebrating()
{
System.out.println("Invoking celebrating method  in Diwali");
System.out.println(super.getDate());
System.out.println(super.getTotalFest());
}
public void lighting()
{
System.out.println("Diwali is full of lighting");
}
}