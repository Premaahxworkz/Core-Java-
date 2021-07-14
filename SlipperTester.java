class SlipperTester{
public static void main(String a[])
{
Slipper slip=new Slipper();
slip.brand="VKC";
slip.size=5;
slip.color="blue";
slip.type="flat";
slip.isForLadies=true;
System.out.println(slip.size);
System.out.println(slip.hashCode());

Slipper slip1=new Slipper();
slip1.brand="Paragon";
slip1.size=6;
slip1.color="red";
slip1.type="sandle";
slip1.isForLadies=false;
System.out.println(slip1.size);
System.out.println(slip1.hashCode());
boolean type= slip.equals(slip1);
System.out.println(type);
}
}