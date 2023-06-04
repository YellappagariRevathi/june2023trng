class Teststringcomparision{
public static void main(String args[]){
String s1="Sachin";
String s2="Sachin1";
String s3=new String("Sachin");
String s4="saurav";
System.out.println(s1.equals(s2));//true
System.out.println(s1.equals(s3));//true
System.out.println(s1.equals(s4));//flase
}
}