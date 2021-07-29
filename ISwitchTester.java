class ISwitchTester{
public static void main(String a[]){
ISwitch tube=new TubeLightImpl();
tube.sOn();
tube.sOff();
ISwitch cfl=new CflBulbImpl();
cfl.sOn();
cfl.sOff();
}
}
