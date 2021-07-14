class EngineerTester
{
public static void main(String a[])
{
Engineer engineer=new Engineer();
engineer.setUSN("USN changed with branch");
engineer.problemSolving();
System.out.println(engineer.getUSN());
System.out.println("############");
CSEngineer cs=new CSEngineer();
cs.setUSN("152CS11035");
cs.problemSolving();
cs.coding();
System.out.println(cs.getUSN());
System.out.println("############");
ECEngineer ec=new ECEngineer();
ec.setUSN("152EC11035");
ec.problemSolving();
ec.electrialConnecting();
System.out.println(ec.getUSN());
System.out.println("############");
EEEngineer eee=new EEEngineer();
eee.setUSN("152eee11035");
eee.problemSolving();
eee.circuitDesign();
System.out.println(eee.getUSN());
System.out.println("############");
CivilEngineer cvl=new CivilEngineer();
cvl.setUSN("152cvl11035");
cvl.problemSolving();
cvl.construction();
System.out.println(cvl.getUSN());
System.out.println("############");
ISEngineer is=new ISEngineer();
is.setUSN("152is11035");
is.problemSolving();
is.subBranch();
System.out.println(is.getUSN());
System.out.println("############");
ITEngineer it=new ITEngineer();
it.setUSN("152it11035");
it.problemSolving();
it.subOf();
System.out.println(it.getUSN());
System.out.println("############");
Engineer br=new CSEngineer();
System.out.println(br.getBranch());
Engineer br1=new CivilEngineer();
System.out.println(br1.getBranch());
Engineer br2=new ECEngineer();
System.out.println(br2.getBranch());
Engineer br3=new EEEngineer();
System.out.println(br3.getBranch());
Engineer br4=new ISEngineer();
System.out.println(br4.getBranch());
Engineer br5=new ITEngineer();
System.out.println(br5.getBranch());
}
}
