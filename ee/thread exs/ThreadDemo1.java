import java.io.*;

class Myclass extends Thread
{
boolean stop=false;
public void run()
{
	
for (int i=1; i<=1000000;i++)
{
  System.out.println(i);
  //t1.sleep(200);
  if (stop)
return;
    }
}
 }


 class ThreadDemo1 
 {
 public static void main(String a[]) throws Exception
 {
 Thread t = Thread.currentThread();
 System.out.println(t);
 System.out.println(t.getName());

 Myclass m1= new Myclass();
 Thread t1 = new Thread(m1);
  System.out.println(t1.currentThread());
  System.out.println(t1.getName());
 t1.start();
System.in.read();
m1.stop=true;
 
 }
 }