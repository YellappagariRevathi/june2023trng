class Simple{
public static void main(String args[]){
StringTokenizer st=new StringTokenizer("my name is rev"",");
while(st.hasMoreTokens()){
System.out.println(st.nextToken());
}
}
}