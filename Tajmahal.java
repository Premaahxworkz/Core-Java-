class Tajmahal extends Monument
{
@Override
public void visiting()
{
System.out.println("Invoking Visiting method  in Tajmahal");
System.out.println(super.getBuildBy());
System.out.println(super.getYear());
}
public void sign()
{
System.out.println("Tajmahal is the sign love");
}
}


















