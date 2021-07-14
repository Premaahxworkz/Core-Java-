class RiverUtil
{
public static void main(String a[])
{
River river=new River();
river.flowing();
Kaveri kv=new Kaveri();
kv.setRisesAt("Brahmagiri Hill");
kv.setFlowsInKm(800);
kv.flowing();
kv.drinking();

River rv=new Kaveri();
Kaveri kvr =(Kaveri)rv;
kvr.drinking();
}
}