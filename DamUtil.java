class DamUtil
{
public static void main(String a[ ] )
{
Dam dam = new Dam();
dam.storing();
KRS krs = new KRS();
krs.setLocated("Mysore");
krs.setYear(1911);
krs.storing();
krs.generating();
Dam dm=new KRS();
KRS ks=(KRS) dm;
ks.generating();
}
}
