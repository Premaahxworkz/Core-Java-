class MonumentUtil
{
public static void main(String a[ ] )
{
Monument monument = new Monument();
monument.visiting();
Tajmahal taj = new Tajmahal();
taj.setBuildBy("Shahajan");
taj.setYear(1648);
taj.visiting();
taj.sign();
Monument monu=new Tajmahal();
Tajmahal mahal=(Tajmahal) monu;
mahal.sign();
}
}
