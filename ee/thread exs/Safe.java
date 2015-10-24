//2 threads actin on the same obj....
class Reserve extends Thread{
 int available=0;
 int wanted;
Reserve(int i){
wanted = i;
}
public void run(){
synchronized(this){
System.out.println("no. of berths avail=:"+available);
if(available>=wanted)
{
 String name = Thread.currentThread().getName();
System.out.println(wanted + " berths alotted for " +name);
try{
Thread.sleep(2000);
available = available-wanted;
   }
catch(InterruptedException ie){}
}
else
System.out.println("berths are not avail to allot");
}
 }
}



class Safe{
public static void main(String a[])throws Exception{
Reserve obj = new Reserve(1);
Thread t1 = new Thread(obj);
Thread t2 = new Thread(obj);

t1.setName("First person");
t2.setName("second person");

t1.start();
t2.start();

 }
}

