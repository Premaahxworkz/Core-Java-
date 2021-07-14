class TempleTester{
public static void main(String a[])
{
Temple temple1=new Temple();
temple1.distance=250;
temple1.name="Tirupati";
temple1.place="AndraPradesh";
temple1.entryFees=300;
temple1.isOpen=false;
System.out.println(temple1.distance);
System.out.println(temple1.hashCode());

Temple temple2=new Temple();
temple2.distance=250;
temple2.name="Tirupati";
temple2.place="AndraPradesh";
temple2.entryFees=300;
temple2.isOpen=true;
System.out.println(temple2.name);
System.out.println(temple2.hashCode());
boolean type= temple1.equals(temple2);
System.out.println(temple2.distance);
System.out.println(type);
}
}