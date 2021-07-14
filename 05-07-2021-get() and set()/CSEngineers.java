class CSEngineers extends Engineer
{
Constants branch = Constants.CS;
@Override
public void problemSolving()
{
super.problemSolving();
super.setUSN("152cs11035");
System.out.println(super.getUSN());
System.out.println("invoked problemSolving method of "+this.branch);
}
public void coding()
{
System.out.println("coding mentod invoked");
}
public Constants getBranch()
{
return branch;
}
}
