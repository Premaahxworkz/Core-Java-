class Kaveri extends River
{
@Override
public void  flowing()
{
System.out.println("Invoking flowing method of River, in  Kaveri");
System.out.println(super.getRisesAt());
System.out.println(super.getFlowsInKm());
}
public void drinking()
{
System.out.println("Will use Kaveri water for drinking purpose");
}
}