
public class Buffer {
	final int MAXSIZE = 512;
	char keep[];
	int count, front, rear;
	
	public synchronized char get() throws InterruptedException {
		while (count == 0)
			wait();
		char x = keep[rear];
		rear = (rear+1) % MAXSIZE;
		count--;
		notify();
		return x;
	}
	
	public synchronized void put (char x) throws InterruptedException{
		while (count == MAXSIZE)
			wait();
		keep[front] = x;
		front = (front+1) % MAXSIZE;
		count++;
		notify();
	}
	
	Buffer(){
		keep = new char [MAXSIZE];
		count = 0;
		front = rear = 0;
	}

}
