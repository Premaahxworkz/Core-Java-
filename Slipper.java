class Slipper{
public String brand;
public int size;
public String color;
public String type;
public boolean isForLadies;
public Slipper(){
System.out.println();
}
@Override
public int hashCode(){
return this.size;
}
@Override
public boolean equals(Object slipper){
if(slipper instanceof  Slipper){
Slipper slipper1=(Slipper)slipper;
if(this.hashCode() == slipper.hashCode()){
return true;
}
if(this.brand.equals(slipper1.brand)){
return true;
}else{
System.out.println("Brand is diffrent");
}
if(this.size==slipper1.size){
return true;
}else{
System.out.println("size is diffrent");
}
if(this.color==slipper1.color){
return true;
}else{
System.out.println("color  is diffrent");
}
if(this.type==slipper1.type){
return true;
}else{
System.out.println("type is diffrent");
}
if(this.isForLadies==slipper1.isForLadies){
return true;
}else{
System.out.println("it is not for ladies");
}
}else{
System.out.println("Not a same type");
return false;
}
return false;
}
}

