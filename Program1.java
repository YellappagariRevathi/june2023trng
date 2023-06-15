interface Printable{
void print();
}
class A implements Printable{
public void print(){System.out.println("Hello");}
public static void main(String args[]){
A obj=new A();
obj.print();
}
}
