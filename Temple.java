class Temple{
public int distance;
public String name;
public String place;
public int entryFees;
public boolean isOpen;
public Temple(){
System.out.println();
}
@Override
public int hashCode(){
return this.distance;
}
@Override
public boolean equals(Object temple){
if(temple instanceof  Temple){
Temple temple1=(Temple)temple;
if(this.hashCode() == temple.hashCode()){
return true;
}
if(this.distance==temple1.distance){
return true;
}else{
System.out.println("Distance is diffrent");
}
if(this.name==temple1.name){
return true;
}else{
System.out.println("Name is diffrent");
}
if(this.place==temple1.place){
return true;
}else{
System.out.println("Temple is diffrent");
}
if(this.entryFees==temple1.entryFees){
return true;
}else{
System.out.println("Entry fee is diffrent");
}
if(this.isOpen==temple1.isOpen){
return true;
}else{
System.out.println("temple is closed");
}
}else{
System.out.println("Not a same type");
return false;
}
return false;
}
}

