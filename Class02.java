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
//1.���i�H
//2.�]��private���N�q�O������O�����~�వ�s�����ʧ@�Aset_num�Bshow�w�W�X�d��ҥH�L�k����C