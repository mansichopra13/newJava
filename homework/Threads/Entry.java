package homework.Threads;

public class Entry {

	static int count;
	public static void main(String[] args) {
		
		Thread t= Thread.currentThread();
		System.out.println(t);//name priority group
		t.setName("hardik");
		System.out.println(t);
		
		
		IncThread objIncThread=new IncThread();
		objIncThread.start();
		
		DecThread objJob=new DecThread();
		Thread objDecThread=new Thread(objJob);
		objDecThread.start();
		
		
		
		int i=1;
		
		while(i<=100000000)
		{
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main thread "+ i);
			i++;
		}
		
		
	}
}
class DecThread implements Runnable 
{

	public void run() {
		while(true)
		{
			Entry.count--;
			System.out.println("Dec thread "+Entry.count);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class IncThread extends Thread
{
	public void run()
	{
		while(true)
		{
			Entry.count++;
			System.out.println("IncThread "+Entry.count);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
