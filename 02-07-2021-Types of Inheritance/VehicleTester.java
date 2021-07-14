class VehicleTester
{
public static void main(String a[])
{
Car cr=new Car();
cr.price=5.4d;
cr.minSpeed="50km/h";
cr.travelling();
System.out.println("The vehicle price is " +cr.price+ " and speed is " +cr.minSpeed);

}
}