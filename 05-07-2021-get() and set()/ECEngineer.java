class ECEngineer extends Engineer
{
Constants branch=Constants.EC;
@Override
public void problemSolving()
{
super.problemSolving();
super.getUSN();
System.out.println("Invoked problem solving method of "+this.branch);
}
public void electrialConnecting()
{
System.out.println("EC consists of electrical works "+this.branch);
}
public Constants getBranch()
{
return branch;
}
}