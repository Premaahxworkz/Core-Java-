class Pacific extends Ocean
{
@Override
public void covering ()
{
System.out.println("Invoking covering method  in Pacific");
System.out.println(super.getVolumeInBillion());
System.out.println(super.getAreaInSqMtr());
}
public void fishing()
{
System.out.println("It is difficult to done fishing in Ocean"); 
}
}