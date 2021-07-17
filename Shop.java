class Shop{
String name;
String location;
 int phoneNo;
public Shop(){
System.out.println("Shop obejct is created");
}
{
System.out.println(" Instance init block is created");
 String name="Bahubali N Muttin";
 String location="Chadchan";
long phoneNo=9430304886L;
System.out.println("Shop name is: " +name+ " locatated in "+location+" and phone number is :" +phoneNo);
System.out.println(" Instance init block is ended");
}
public void selling(){
System.out.println("Shops are used to sell the items or things");
}
static{
System.out.println("Static block is started");
 String name="Kasat";
 String location="Bagalkot";
long phoneNo=95748363623L;
System.out.println("Shop name is: "+name+ " locatated in " +location+ " and phone number is : " +phoneNo);
System.out.println(" static block is ended");
}
}


