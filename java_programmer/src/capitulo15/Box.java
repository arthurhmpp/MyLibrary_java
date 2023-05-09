package capitulo15;

public class Box<T> {
	T t;
	
	public Box(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
}
