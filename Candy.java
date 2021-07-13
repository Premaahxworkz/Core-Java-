class Candy
{
 public static void main(String a[])
 {
  eat(7);
  eat("Best Friends");
 }
 public static void eat(int noOfCandy)
 {
  System.out.println("Eating "+ noOfCandy + " candy alone");
 }
 public static void eat(String friends)
 {
  System.out.println("Eating Candy with " + friends);
 }
}