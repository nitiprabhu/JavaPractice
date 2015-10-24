//usin thread groups.....
class WhyTGroups{
public static void main(String a[])throws Exception{

Reservation res = new Reservation();
Cancellation can = new Cancellation();

//create a thread group with name....
ThreadGroup tg = new ThreadGroup("Reservation Group");

//create 2 threads & add themto thred group...
Thread t1 = new Thread(tg,res,"FirstThread");
Thread t2 = new Thread(tg,res,"SecondThread");

//create another thread group as a child to tg....
ThreadGroup tg1 = new ThreadGroup(tg,"cancellation group");

//creat 2 threads & add them to 2nd thread group....
Thread t3 = new Thread(tg1,can,"ThirdThread");
Thread t4 = new Thread(tg1,can,"FourthThread");

System.out.println("no. of threads active in this group = "+tg.activeCount());

//to find parent group of tg1....
System.out.println("parent of tg1 = "+tg1.getParent());


//set max priority to tg1 as '7'...

tg1.setMaxPriority(7);

//know the thread group t1 & t3...

System.out.println("Thread group of t1 = "+t1.getThreadGroup());
System.out.println("Thread group of t3 = "+t3.getThreadGroup());


//start threads...

t1.start();
t2.start();
t3.start();
t4.start();
System.out.println("no. of threads active in this group = "+tg.activeCount());

 }
}


class Reservation extends Thread{
public void run(){
System.out.println("i m in reservation thread");
 }
}


class Cancellation extends Thread{
public void run(){
System.out.println("i m in Cancellation thread");
 }
}
