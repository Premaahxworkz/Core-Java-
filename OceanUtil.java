class OceanUtil
{
public static void main(String a[ ] )
{
Ocean ocean = new Ocean();
ocean.covering();
Pacific pacific = new Pacific();
pacific.setAreaInSqMtr(361);
pacific.setVolumeInBillion(1.50);
pacific.covering();
pacific.fishing();
Ocean oc=new Pacific();
Pacific paci=(Pacific) oc;
paci.fishing();
}
}