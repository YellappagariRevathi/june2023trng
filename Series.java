import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();//15
int k=sc.nextInt();//3
for(int i=n;i>=0;i-=k)
{
System.out.print(i);
if(i>=k) 
System.out.print(",");
}
}
}
