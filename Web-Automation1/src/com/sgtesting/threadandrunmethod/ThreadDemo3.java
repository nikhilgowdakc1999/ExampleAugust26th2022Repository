package com.sgtesting.threadandrunmethod;
class MyThread2 implements Runnable
{
	
	synchronized void displayEvenNumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+"Even no:"+i);
				}
			}	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void run() {
		displayEvenNumbers();
		
	}
}
public class ThreadDemo3 {

	public static void main(String[] args) {
	
		MyThread2 job=new MyThread2();
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);
		t1.setName("Alpha");
        t2.setName("Omega");
        t1.start();
        t2.start();

	}

}
