package the_exam;

class AThread1 extends Thread
{
	int i=0;
	public void run()
	{
		while(i<8)
		{
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("[execution_AThread1]-["+i+"]");
			i++;
		}
		
	}
}

class AThread2 extends Thread
{
	int i=0;
	public void run()
	{
		while(i<8)
		{
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("[execution_AThread2]-["+i+"]");
			i++;
		}
		
	}
}

public class Main {

	public static void main(String[] args) {
		AThread1 thread1 = new AThread1();
		AThread2 thread2 = new AThread2();
		thread1.start();
		thread2.start();

	}

}
