class FestivalUtil
{
public static void main(String a[ ] )
{
Festival festival = new Festival();
festival.celebrating();
Diwali diwali = new Diwali();
diwali.setDate("dd/mm/yy");
diwali.setTotalFest(9 );
diwali.celebrating();
diwali.lighting();
Festival fest=new Diwali();
Diwali diwa=(Diwali) fest;
diwa.lighting();
}
}