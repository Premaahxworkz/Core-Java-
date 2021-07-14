class BagTester{
public static void main(String a[])
{
Bag bg1=new Bag();
bg1.bagId=100;
bg1.brand="Niyon";
bg1.size=5;
bg1.color="orange";
bg1.type="double sided";
System.out.println(bg1.size);
System.out.println(bg1.hashCode());

Bag bg2=new Bag();
bg2.bagId=200;
bg2.brand="Riyon";
bg2.size=7;
bg2.color="gray";
bg2.type="single sided";
System.out.println(bg2.size);
System.out.println(bg2.hashCode());
boolean type= bg1.equals(bg2);
System.out.println(type);
}
}