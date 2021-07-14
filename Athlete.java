class Athlete
{
String gameName;
int diedOn;
public  Athlete()
{
 System.out.println("Athlete object is created");
}
public void competition()
{
 System.out.println("Athlete is one who is participating in competation ");
}
public void setGameName(String gameName)
{
 this.gameName=gameName;
}
 public String getGameName()
{
 return gameName;
}
 public void setDiedOn(int diedOn)
{
 this.diedOn=diedOn;
}
 public int getDiedOn()
{
 return diedOn;
}
}