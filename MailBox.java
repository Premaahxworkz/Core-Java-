class MailBox{
public static String emailID;
public static long password;
public int noOfSentMails;
public int noOfRcvMails;
public MailBox(){
System.out.println("MailBox object is created");
}
{
System.out.println("Instance init Block object is created");
String emailID="preevh63@gmail.com";
long password=8745672231L;
int noOfSentMails=100;
int noOfRcvMails=2;
System.out.println(emailID+" "+password+" "+noOfSentMails+" "+noOfRcvMails);
System.out.println("Instance init Block object is ended");
}
static{
System.out.println("Static Block object is created");
String emailID="premaah@gmail.com";
long password=876435890L;
int noOfSentMails=50;
int noOfRcvMails=1;
System.out.println(emailID+" "+password+" "+noOfSentMails+" "+noOfRcvMails);
System.out.println("Static Block ended");
}
public static void infoTransferring(){
System.out.println("MailBox is used to send and receive the information");
}
}

