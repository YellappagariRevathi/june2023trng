import java.util.Scanner;
class ArrayElements{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[] arr=new int[]{10,20,30,50,40};
int avg=0;
for(int i=0;i< arr.length;i++)
{
avg=avg/arr[i];
}
System.out.println("Avarage of all the elements of an array:"+avg);
}
}