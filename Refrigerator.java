class Refrigerator{
String brand;
double price;
public Refrigerator(){
System.out.println("Refregerator object is created");
}

static{
System.out.println("Static method is started");
String brand="Samsung";
double price=30000;
System.out.println("Refrigerator brand is: "+brand+ " Price is: " +price);
System.out.println("Static method is ended");
}
{
System.out.println("Instance init block is started");
String brand="LG";
double price=40000;
System.out.println("Refrigerator brand is: "+brand+ " Price is: " +price);
System.out.println("Instance init block is ended");
}
static void freshness(){
System.out.println("Refrigerator is used for things to be fresh");
}
}
