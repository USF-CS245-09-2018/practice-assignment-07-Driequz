public class ArrayList implements List {

	int size;
	Object[] obj;
	
	public ArrayList() {
		obj = new Object[10];
		size = 0;
	}
	@Override
	public void add(Object objj) {
		// TODO Auto-generated method stub
		//String []  = new String[10];
		if(size == this.obj.length)
			resize();
		this.obj[size] = objj;
		++size;

	}

	@Override
	public void add(int pos, Object obj) {
		// TODO Auto-generated method stub
		//int size = 0;
		//String [] a = new String[10];
		if(pos > size || pos < 0){
			throw new IndexOutOfBoundsException();
			}
			else if (size == this.obj.length){
			resize();

			}

			for(int i = size; i >pos; i--){
				this.obj[i] = this.obj[i-1];
			}
			this.obj[pos] = obj;
			size++;


	}

	@Override
	public Object get(int pos) {
		// TODO Auto-generated method stub
		if(pos >= size || pos < 0)
		throw new IndexOutOfBoundsException();
		return obj[pos];
	}

	@Override
	public Object remove(int pos) {
		// TODO Auto-generated method stub
		//int size = 0;
		//int [] ob = new int[10];
		//int [] a;
		if(pos >= size || pos < 0)
			throw new IndexOutOfBoundsException();

			Object temp = this.obj[pos];
			for(int i = pos; i < size-1; i++)
				this.obj[i] = this.obj[i+1];
			--size;
			return temp;

		//return null;
	}
	
	public void resize() {
		Object[]newArray = new Object[size * 2];
		for(int i = 0; i < size;i++)
			newArray[i] = this.obj[i];
		this.obj = newArray;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		
		return size;
	}

}
