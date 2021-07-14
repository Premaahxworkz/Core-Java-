class NewsPaperTester{
public static void main(String a[])
{
NewsPaper news1=new NewsPaper();
news1.newsPaperId=5;
news1.name="Vijay Karnataka";
news1.price=5.5d;
news1.type="kannada";
news1.noOfPages=8;
System.out.println(news1.name);
System.out.println(news1.hashCode());

NewsPaper news2=new NewsPaper();
news2.newsPaperId=5;
news2.name="Vijay Karnataka";
news2.price=5.5d;
news2.type="kannada";
news2.noOfPages=8;
System.out.println(news1.name);
System.out.println(news1.hashCode());
boolean type= news1.equals(news2);
System.out.println(type);
}
}