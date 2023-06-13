import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(Sytsem.in);
int n=sc.nextInt();
int k=sc.nextInt();
for(int i=n,i>=0,i-=k)
{
System.out.print(i);
if(i>0) 
System.out.print(",");
}
}
}
