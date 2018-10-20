
import java.util.EmptyStackException;
public class ArrayStack implements Stack {

	private Object[] elements;
	private int size;
	@Override
	public void push(Object item) {
		// TODO Auto-generated method stub
		if (size == elements.length) {
			resize();
		}
		elements[size] = item;
		size++;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if (size == 0) {
			throw new EmptyStackException();
		}
		
		Object top = elements[size - 1];
		elements[size - 1] = null;
		size--;
		return top;
		//return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		if (size == 0) {
			throw new EmptyStackException();
		}
		return elements[size - 1];
		//return null;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return size == 0;
		//return false;
	}
	@Override
	public void resize() {
		
		Object [] newElements =  (new Object[2 * size]);
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
		}
		elements = newElements;
	}
	
	public ArrayStack() {
		 elements = new Object[10];
	}
	public ArrayStack(int capacity) {
		elements = new Object[capacity];
	}

}
