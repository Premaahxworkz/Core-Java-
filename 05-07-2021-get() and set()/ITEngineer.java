class ITEngineer extends Engineer
{
Constants branch=Constants.IT;
@Override
public void problemSolving()
{
super.problemSolving();
super.getUSN();
System.out.println("invoked problemSolving method of "+this.branch);
}
public void subOf()
{
System.out.println("Child branch of EC is"+this.branch);
}
public Constants getBranch()
{
return branch;
}
}
