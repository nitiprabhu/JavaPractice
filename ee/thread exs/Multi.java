//multitasking usin 2 threads 
//2 threads actin on 2 objs....

class Theatre implements Runnable{
String str;

Theatre(String str)
{
  this.str = str;
}

public void run(){
for(int i=1;i<=10;i++)
{
 System.out.println(str+":"+i);
try{
Thread.sleep(2000);
}
catch(InterruptedException ie){
ie.printStackTrace();
 }
  } 
 }
}

class Multi{
public static void main(String a[])throws Exception{
Theatre obj1 = new Theatre("cut ticket");
Theatre obj2 = new Theatre("show ticket");

Thread t1 = new Thread(obj1);
Thread t2 = new Thread(obj2);

t1.start();
t2.start();
 }
} 