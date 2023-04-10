
public class MultiThreading extends Thread {
	@Override
public void run()
{
		System.out.println("Run Method");
}
	public static void main(String[] args) {
		MultiThreading t=new MultiThreading();
		t.start();
	}
}
