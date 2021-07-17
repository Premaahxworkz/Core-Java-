class Medicine{
static String name;
static String purpose;
static double price;
static void Medicine(){
System.out.println("Medicine object is created");
}
public static void main(String a[])
{
System.out.println("Main method is started");
Medicine med=new Medicine();
med.Medicine();
}
static{
System.out.println("Static block is started");
String name="dolo-650";
String purpose="body pain and fever";
double price=5.69d;
System.out.println ("Tablet name is: "+ name+ " used for " +purpose+  "and price is:  " +price);
System.out.println ("Static block is ended");
}
{
System.out.println("Instance int block is started");
String name="cold-act";
String purpose="cold";
double price=10.50d;
System.out.println("Tablet name is: "+ name+ " used for " +purpose+  "and price is:  " +price);
System.out.println("Instance int block is ended");
}
}