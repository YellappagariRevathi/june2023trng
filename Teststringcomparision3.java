class Teststringcomparision3{
public static void main(String args[]){
String s1="Sachin";
String s2="Sachin";
String s3=new String("Sachin");
System.out.println(s1==s2);//true(because both refer to same instance)
System.out.println(s1==s3);//flase(because s3 refer to instance created in nonpool)
}
}