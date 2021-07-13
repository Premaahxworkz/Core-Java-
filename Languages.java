class Languages
{
public static void main(String a[])
 {
  defineLanguages("C-programming","Dennis Ritchie",1972);
  defineLanguages("C++","Bjarne Stroustrup",1980);
  defineLanguages("java","James Gosling and his team",1996);
 }
public static void defineLanguages(String langName,String devName,int year)
{
 System.out.println(langName);
 System.out.println(devName);
 System.out.println(year);
}
}
