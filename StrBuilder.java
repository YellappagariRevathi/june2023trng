class StrBuilder{
public static void main(String args[]){
StringBuilder s1=new StringBuilder("Hello");
StringBuilder s2=new StringBuilder("World"); 
StringBuilder s=s1.appened(s1); 
System.out.println(s.toString());
}
}
