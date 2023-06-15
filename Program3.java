class ThreadGroupDemo implements runnable{
public void run(){
System.out.println(Thread.currentThread().getName());
}
public static void main(String args[s]){
ThreadGroupDemo runnable=new ThreadGroupDemo();
ThreadGroup tg1=new ThreadGroup("parent ThreadGroup");
Thread
t1.start();
