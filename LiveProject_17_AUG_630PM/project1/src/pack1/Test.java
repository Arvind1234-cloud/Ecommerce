package pack1;

public class Test {

	public static void main(String[] args) {
		Parent p=new Child();
		p.m1();
		((Child)p).m2();
	}

}
