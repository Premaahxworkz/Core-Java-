import java.util.Scanner;
class CoconutTreeUtil
{
public static void main(String a[])
{
Scanner scan= new Scanner(System.in);
System.out.println("Enter Height of the tree");
double height=scan.nextDouble();
System.out.println("Enter Year");
int year=scan.nextInt();
CoconutTree tree=new CoconutTree();
tree.height=height;
tree.year=year;
System.out.println(tree.height+" " +tree.year);
}
}