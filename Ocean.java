class Ocean
{
long areaInSqMtr;
double volumeInBillion;
public Ocean()
{
 System.out.println("Ocean object is created");
}
public void covering ()
{
 System.out.println("Ocean is covering with a 71% of salt water");
}
public void setAreaInSqMtr(long areaInSqMtr )
{
 this.areaInSqMtr=areaInSqMtr;
}
 public long getAreaInSqMtr()
{
 return areaInSqMtr;
}
 public void setVolumeInBillion(double volumeInBillion)
{
 this.volumeInBillion=volumeInBillion;
}
 public double getVolumeInBillion()
{
 return volumeInBillion;
}
}