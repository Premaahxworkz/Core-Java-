class ArithmeticOperations
{
public static void main(String a[])
{ 
 calArithmeticOperations(1.1f,"Addition",'+');
 calArithmeticOperations(1.2f,"Subtraction",'-');
 calArithmeticOperations(1.3f,"Multiplication",'*');
 calArithmeticOperations(1.4f,"Division",'/');
}
public static void calArithmeticOperations(float serialNo, String opType,char symbol)
{
System.out.println(serialNo);
System.out.println(opType);
System.out.println(symbol);
}
}
 