class Bag{
public int bagId;
public String brand;
public int size;
public String color;
public String type;
public Bag(){
System.out.println();
}
@Override
public int hashCode(){
return this.bagId;
}
@Override
public boolean equals(Object bag){
if(bag instanceof  Bag){
Bag bag1=(Bag)bag;
if(this.hashCode() == bag.hashCode()){
return true;
}
if(this.brand.equals(bag1.brand)){
return true;
}else{
System.out.println("Brand is diffrent");
}
if(this.size==bag1.size){
return true;
}else{
System.out.println("size is diffrent");
}
if(this.color==bag1.color){
return true;
}else{
System.out.println("color  is diffrent");
}
if(this.type==bag1.type){
return true;
}else{
System.out.println("type is diffrent");
}
}else{
System.out.println("Not a same type");
return false;
}
return false;
}
}

