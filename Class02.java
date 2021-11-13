package Class02;

class Caaa{
	private int num1;
	private int num2;
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
}

public class Class02 {
	public static void main(String[] args) {
		Cbbb bb = new Cbbb();
		bb.set_num(5 , 10);
		bb.show();
	}
}
//1.不可以
//2.因為private的意義是對於類別內的才能做存取的動作，set_num、show已超出範圍所以無法執行。