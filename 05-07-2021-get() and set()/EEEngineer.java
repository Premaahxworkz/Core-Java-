class EEEngineer extends Engineer
{
Constants branch=Constants.EEE;
@Override
public void problemSolving()
{
super.problemSolving();
super.getUSN();
System.out.println("Invoked problem solving method of "+this.branch);
}
public void circuitDesign()
{
System.out.println("Consists of circuit design "+this.branch);
}
public Constants getBranch()
{
return branch;
}
}