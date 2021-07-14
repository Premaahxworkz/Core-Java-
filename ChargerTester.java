class ChargerTester{
public static void main(String a[])
{
Charger charge=new Charger();
charge.id=30;
charge.designedFor="Android";
charge.type="usb";
charge.brand="vivo";
charge.isMadeInIndia=true;
System.out.println(charge.id);
System.out.println(charge.hashCode());

Charger charge1=new Charger();
charge1.id=20;
charge1.designedFor="Android";
charge1.type="usb";
charge1.brand="vivo";
charge1.isMadeInIndia=true;
System.out.println(charge1.id);
System.out.println(charge1.hashCode());
boolean type=charge.equals(charge1);
System.out.println(type);
}
}