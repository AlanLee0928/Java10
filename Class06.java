package Class06;

class CTriangle{
	protected int base;
	protected int height;
	
	protected void show() {
		System.out.println("base=" + base + ", height=" + height);
	}
}

class CData extends CTriangle{
	public CData(int a , int b) {
		super.base = a;
		super.height = b;
	}
	void area() {
		super.show();
		System.out.println("area=" + super.base * (double)super.height / 2);
	}
}

public class Class06 {
	public static void main(String[] args) {
		CData obj = new CData(3 , 8);
		obj.area();
	}
}