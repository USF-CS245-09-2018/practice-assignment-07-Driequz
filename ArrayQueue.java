import java.util.NoSuchElementException;
public class ArrayQueue implements Queue {

	
	private Object[] array;
	private int capacity;
    private int size = 0;
    private int head = 0; 
    private int tail = 0; 
    @Override
   
	public Object dequeue() {
		// TODO Auto-generated method stub
		if (size == 0) {
            throw new NoSuchElementException("Cannot remove from empty queue");
        }
        Object item = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        size--;
        return item;
	}

	@Override
	public void enqueue(Object item) {
		// TODO Auto-generated method stub
		 if (size == capacity ) {
			 resize();
		 }
	        array[tail] = item;
	        tail = (tail + 1) % array.length;
	        size++;
	        
	}
	
	public void resize() {
		
		Object[]newArray = new Object[capacity * 2];
		for(int i = head; i < capacity + head; i++)
			newArray[tail++] = array[i % array.length];
			array = newArray;

	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return size == 0;
		//return false;
	}
	 public ArrayQueue() {
		  capacity = 10;
	     array = new Object[capacity];
	    }
	 public ArrayQueue(int capacity) {
		 this.capacity = capacity;
	        array = new Object[capacity];
	    }

}
