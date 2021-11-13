package Class05;

class Caaa{
	private int num;
	
	public void Caaa() {
		num = 2;
	}
	public int get() {
		return num;
	}
}
class Cbbb extends Caaa{
	public Cbbb() {
		super.Caaa();
	}

	public void show() {
		System.out.println("num=" + get());
	}
}

public class Class05 {
	public static void main(String[] args) {
		Cbbb bb = new Cbbb();
		bb.show();
	}
}