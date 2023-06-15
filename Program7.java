import java.util.StringTokenizer;
class StringTokenizer1{
public static void main(String args[]){
StringTokenizer st=new StringTokenizer("my name is revathi"," ");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}