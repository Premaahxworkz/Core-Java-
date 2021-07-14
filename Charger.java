class Charger{
public int id;
public String designedFor;
public String type;
public String brand;
public boolean isMadeInIndia;
public Charger(){
System.out.println();
}
@Override
public int hashCode(){
return this.id;
}
@Override
public boolean equals(Object charger){
if(charger instanceof  Charger){
Charger charger1=(Charger)charger;
if(this.hashCode() == charger.hashCode()){
return true;
}
if(this.designedFor==charger1.designedFor){
return true;
}else{
System.out.println("Designed for  is diffrent");
}
if(this.brand==charger1.brand){
return true;
}else{
System.out.println("brand is diffrent");
}
if(this.type==charger1.type){
return true;
}else{
System.out.println("type is diffrent");
}
if(this.isMadeInIndia==charger1.isMadeInIndia){
return true;
}else{
System.out.println("Made in China");
}
}else{
System.out.println("Not a same type");
return false;
}
return false;
}
}

