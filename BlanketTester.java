class BlanketTester{
public static void main(String a[])
{
Blanket blanket1=new Blanket();
blanket1.modelId=20;
blanket1.size="40*50 inch";
blanket1.material="woolan";
blanket1.price=560.0d;
blanket1.isSingle=true;
System.out.println(blanket1.modelId);
System.out.println(blanket1.hashCode());

Blanket blanket2=new Blanket();
blanket2.modelId=20;
blanket2.size="50*70 inch";
blanket2.material="woolan";
blanket2.price=560.0d;
blanket2.isSingle=false;
System.out.println(blanket2.modelId);
System.out.println(blanket2.hashCode());
boolean type= blanket1.equals(blanket2);
System.out.println(type);
}
}