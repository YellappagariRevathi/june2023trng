import java.util.Scanner;
class Pattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<n;j++)
{
System.out.print("#");
}
for(int j=1;j<=i;j++)
{
System.out.print(ch);
}
System.out.println();
}

}
}
