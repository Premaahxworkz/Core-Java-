class Monument
{
String buildBy;
long year;
public Monument()
{
 System.out.println("Monument object is created");
}
public void visiting()
{
 System.out.println("Visiting Monuments");
}
public void setBuildBy(String buildBy)
{
 this.buildBy=buildBy;
}
 public String getBuildBy()
{
 return buildBy;
}
 public void setYear(long year)
{
 this.year=year;
}
 public long getYear()
{
 return year;
}
}