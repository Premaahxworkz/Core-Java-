class AthleteUtil
{
public static void main(String a[ ] )
{
Athlete athlete = new Athlete();
athlete.competition();
MilkaSingh milkasingh = new MilkaSingh();
 milkasingh.setGameName("Running");
 milkasingh.setDiedOn(2021);
 milkasingh.competition();
 milkasingh.playingFor();
Athlete ath=new MilkaSingh();
MilkaSingh milka=(MilkaSingh) ath;
milka.playingFor();
}
}