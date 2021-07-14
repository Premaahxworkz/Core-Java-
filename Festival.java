class Festival
{
String date;
int totalFest;
public Festival()
{
 System.out.println("Festival object is created");
}
public void celebrating ()
{
 System.out.println("Festivals are the one which we are celebrating with family and friends");
}
public void setDate(String date )
{
 this.date=date;
}
 public String getDate()
{
 return date;
}
 public void setTotalFest(int totalFest)
{
 this.totalFest=totalFest;
}
 public int getTotalFest()
{
 return totalFest;
}
}