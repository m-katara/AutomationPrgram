package BasicJavaProgram;

public class ThreadSleep 
{
		public static void main(String[] args) throws InterruptedException 
		{
			for(int i = 1;i<=10;i++)
			{
				System.out.println(Math.random());
				Thread.sleep(10);
			}
		}

	}

