import java.util.Scanner;
class ISwitchTesters{
public static void main(String a[]){

Scanner scan=new Scanner(System.in);
System.out.println("Enter the light");
String input=scan.next();
ISwitch light=LightFactory.getLight(input);
if(light!=null){
light.sOn();
light.sOff();
}
}
}