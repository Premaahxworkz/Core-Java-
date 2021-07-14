class NewsPaper{
public int newsPaperId;
public String name;
public double price ;
public String type;
public int noOfPages;
public NewsPaper(){
System.out.println();
}
@Override
public int hashCode(){
return this.newsPaperId;
}
@Override
public boolean equals(Object newsPaper){
if(newsPaper instanceof  NewsPaper){
NewsPaper newsPaper1=(NewsPaper)newsPaper;
if(this.hashCode() == newsPaper.hashCode()){
return true;
}
if(this.name.equals(newsPaper1.name)){
return true;
}else{
System.out.println("Name is diffrent");
}
if(this.price==newsPaper1.price){
return true;
}else{
System.out.println("price is diffrent");
}
if(this.noOfPages==newsPaper1.noOfPages){
return true;
}else{
System.out.println("no of pages are diffrent");
}
if(this.type==newsPaper1.type){
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

