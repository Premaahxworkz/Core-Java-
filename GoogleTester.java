class GoogleTester{
public static void main(String a[]){
Laptop top=new Laptop();
Gmail gmail=new Gmail();
Google gmail=new Gmail();//partial abstraction
GoogleDrive gDrive=new GoogleDrive();
top.browse(gDrive);
top.browse(gmail); //partial abstraction
}
}