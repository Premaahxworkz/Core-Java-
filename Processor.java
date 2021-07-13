class Processor
{
  public static void main(String a[])
  {
    showProcessor("Intel Core",64);
    showProcessor("IBM",32);
  }
  public static void showProcessor(String name,int bitNo)
  {
   System.out.println(name);
   System.out.println(bitNo);
  }
}
