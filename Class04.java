package Class04;

class CRectangle{
	private int length;
	private int width;
	
	private void show() {
		System.out.print("length=" + length);
		System.out.print(", width=" + width);
	}
	
	void CRectangle() {
		length = 2;
		width = 2;
	}
	
	void CRectangle(int l , int w) {
		length = l;
		width = w;
	}
	
	void area() {
		System.out.println(length * width);
		System.out.println(length);
		System.out.println(width);
	}
}

class CData extends CRectangle{
	public CData() {
		super.CRectangle();
	}
	public CData(int l , int w) {
		super.CRectangle(l, w);
	}
	public void area() {
		super.area();
	}
}
public class Class04 {
	public static void main(String[] args) {
		CData obj1 = new CData(3 , 8);
		CData obj2 = new CData();
		obj1.area();
		obj2.area();
	}
}