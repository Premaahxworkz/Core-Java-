class River
{
String risesAt;
int flowsInKm;
public void River()
{
System.out.println("River object is created");
}
public void flowing()
{
System.out.println("River flows from one place to another");
}
public void setRisesAt(String risesAt)
{
this.risesAt=risesAt;
}
public String getRisesAt()
{
return risesAt;
}
public void setFlowsInKm(int flowsInKm)
{
this.flowsInKm=flowsInKm;
}
public int getFlowsInKm()
{
return flowsInKm;
}
}