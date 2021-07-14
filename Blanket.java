class Blanket{
public int modelId;
public String size;
public String material;
public  double price;
public boolean isSingle;
public Blanket(){
System.out.println("blanket object is created" );
}
@Override
public int hashCode(){
return this.modelId;
}
@Override
public boolean equals(Object blanket){
if(blanket instanceof  Blanket){
Blanket blanket1=(Blanket)blanket;
if(this.hashCode() == blanket.hashCode()){
return true;
}
if(this.size==blanket1.size){
return true;
}else{
System.out.println("size is diffrent");
}
if(this.material==blanket1.material){
return true;
}else{
System.out.println("material  is diffrent");
}
if(this.price==blanket1.price){
return true;
}else{
System.out.println("Price is diffrent");
}
if(this.isSingle==blanket1.isSingle){
return true;
}else{
System.out.println("not a single");
}
}else{
System.out.println("Not a same type");
return false;
}
return false;
}
}

