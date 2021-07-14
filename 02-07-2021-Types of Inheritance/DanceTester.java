class DanceTester
{
public static void main(String a[])
{
Aerobic aero=new Aerobic();
aero.numOfPeople=1;
aero.thingsRequired="patience";
aero.entertainment();
aero.givingExpression();
aero.learningpatience();
System.out.println("Dance can be performed with only " +aero.numOfPeople+ " member or many and we should have " +aero.thingsRequired);
}
}