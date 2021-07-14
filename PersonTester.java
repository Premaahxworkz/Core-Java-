class PersonTester{
public static void main(String a[])
{
Person son1=new Person();
son1.name="vijay";
son1.age=30;
son1.dob="20-july-1992";
son1.height=6.2d;
son1.weight=60.0d;
System.out.println(son1.name);
System.out.println(son1.hashCode());

Person son2=new Person();
son2.name="vijay";
son2.age=30;
son2.dob="12-april-1995";
son2.height=5.8d;
son2.weight=65.0d;
System.out.println(son2.name);
System.out.println(son2.hashCode());
boolean type= son1.equals(son2);
System.out.println(type);
}
}