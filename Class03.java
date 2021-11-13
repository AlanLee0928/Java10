package Class03;

class Caaa{
	public int num1;
	public int num2;
	public void Caaa() {
		num1 = 1;
		num2 = 1;
	}
	public void Caaa(int a , int b) {
		num1 = a;
		num2 = b;
	}
	void show() {
		System.out.println(num1);
		System.out.println(num2);
	}
}
class Cbbb extends Caaa{
	void set_num(int a , int b) {
		num1 = a;
		num2 = b;
	}
	void show() {
		System.out.println(num1);
		System.out.println(num2);
	}
	public void Cbbb(int a , int b) {
		super.Caaa(a, b);
	}
}

public class Class03 {

	public static void main(String[] args) {
		Caaa aa = new Caaa();
		Cbbb bb = new Cbbb();
		aa.Caaa();
		aa.show();
		aa.Caaa(2, 3);
		aa.show();
		bb.Cbbb(4, 5);
		bb.show();
	}
}