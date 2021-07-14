class Dam
{
String located;
int year;
public Dam()
{
 System.out.println("Dam object is created");
}
public void storing()
{
 System.out.println("Dams are build  to store the water");
}
public void setLocated(String located)
{
 this.located=located;
}
 public String getLocated()
{
 return located;
}
 public void setYear(int year)
{
 this.year=year;
}
 public int getYear()
{
 return year;
}
}