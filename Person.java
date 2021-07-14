class Person{
public String name;
public int age;
public String dob;
public double height;
public double weight;
public Person(){
System.out.println();
}
@Override
public int hashCode(){
return this.age;
}
@Override
public boolean equals(Object person){
if(person instanceof  Person){
Person person1=(Person)person;
if(this.hashCode() == person.hashCode()){
return true;
}
if(this.name.equals(person1.name)){
return true;
}else{
System.out.println("Name is diffrent");
}
if(this.age==person1.age){
return true;
}else{
System.out.println("Age is diffrent");
}
if(this.dob==person1.dob){
return true;
}else{
System.out.println("dob is diffrent");
}
if(this.height==person1.height){
return true;
}else{
System.out.println("Height is diffrent");
}
if(this.weight==person1.weight){
return true;
}else{
System.out.println("weight is different");
}
}else{
System.out.println("Not a same type");
return false;
}
return false;
}
}

