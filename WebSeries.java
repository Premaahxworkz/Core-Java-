class WebSeries{

public static void main(String a[])
{
  saveWebseries("Software Developer","Telugu","NA",true);
  saveWebseries("The family man","Hindi","Amazon Prime",true);
  saveWebseries("The family man-2","Hindi","Amazon Prime", true);
}
public static void saveWebseries(String webSeriesName,String language,String ottPlatform,boolean isOriginals)
{
 System.out.println(webSeriesName);
 System.out.println(language);
 System.out.println(ottPlatform);
 System.out.println(isOriginals);
}
}