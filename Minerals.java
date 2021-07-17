class Minerals{
String type;
int totalIndProduces;
public static void Minerals(){
System.out.println("Minerals object is created");
}
{
System.out.println("Instance init block is started");
String type="Gold";
int totalIndProduces=87;
System.out.println("Mineral type is: "+type);
System.out.println("TotalIndianProduces  is: "+totalIndProduces);
System.out.println(" Instance init block is ended");
}
static{
System.out.println("Static block is started");
String type="Silver";
int totalIndProduces=87;
System.out.println("Mineral type is: "+type);
System.out.println("TotalIndianProduces  is: "+totalIndProduces);
System.out.println(" static  block is ended");
}
}