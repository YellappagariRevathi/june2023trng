class Cal extends Thread{
public static void main(String args[]){
cal obj=new cal();
Threadobj.start();
System.out.println("Threads inside main are very much helpful in java");
}
public void run(){
System.out.println("Threads from overridden rum method are  useful");
}
}