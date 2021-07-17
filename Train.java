class Train{
public static int trainNo;
public static String trainName;
public static String source;
public static String destination;
public Train(){
System.out.println("Train obejct is created");
}
static{
System.out.println(" Instance init block is created");
 int trainNo=697948;
String trainName="Golgumbaz express";
String source="Mysore";
String destination="Solapur";
System.out.println("trainNo is: " +trainNo+ " trainName is "+trainName+" source is : " +source+ "destination is: "+ destination);
System.out.println(" Instance init block is ended");
}
public void travelling(){
System.out.println("For travelling Trains are very usefull compare to buses");
}
{
System.out.println(" Instance init block is created");
 int trainNo=459506;
String trainName="Shatabdi express";
String source="Bangalore";
String destination="chennai";
System.out.println("trainNo is: " +trainNo+ " trainName is "+trainName+ " source is  :" +source+ " destination is: "+ destination);
System.out.println(" Instance init block is ended");
}
}


