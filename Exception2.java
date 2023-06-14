import java.util.*;
class MarksDoesNotFitException extends Exception{
String msg;
MarksDoesNotFitException(String msg){
super(msg);
this.msg=msg;
}
public String toString(){
return msg;
}
}
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int marks=sc.nextInt();
try{
if(marks<0)
{
throw new MarksDoesNotFitException("Entered marks doesn't fulfill the required Marks limit");
}
}
catch(MarksDoesNotFitException ex)
{
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}
