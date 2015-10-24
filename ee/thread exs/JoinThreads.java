class MyThread implements Runnable
{
	int count;
	Thread t;
	MyThread(String name) // Construct a new thread.
	{
		t = new Thread(this, name);
		count = 0;
		t.start(); // start the thread
	}

public void run() 
{
	System.out.println(t.getName() + " starting.");
	try {
	      do{
		          	Thread.sleep(2000);
           System.out.println("In " + t.getName() + ", count is " + count);
			count++;
		} while(count < 5);
	}
	catch(InterruptedException exc) 
	{
		System.out.println(t.getName() + " interrupted.");
	}
	System.out.println(t.getName() + " terminating.");
	}
}

class JoinThreads 
{
	public static void main(String args[]) 
	{
		System.out.println("Main thread starting.");
		MyThread mt1 = new MyThread("Child #1");
		MyThread mt2 = new MyThread("Child #2");
		MyThread mt3 = new MyThread("Child #3");

	System.out.println("Child one is alive:"   + mt1.t.isAlive());
	System.out.println("Child two is alive:"   + mt2.t.isAlive());
	System.out.println("Child three is alive:" + mt3.t.isAlive());

try {
		mt1.t.join();
		mt2.t.join();
		mt3.t.join();
     }
     catch(InterruptedException exc) 
     {
	   System.out.println("Main thread interrupted.");
      }
       
		System.out.println("Child one is alive1:" +mt1.t.isAlive());
        System.out.println("Child two is alive1:" +mt2.t.isAlive());
        System.out.println("Child three is alive1:" +mt3.t.isAlive());
        System.out.println("Main thread ending.");
        
		}
}

