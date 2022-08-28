package abstracttype;

abstract class Demo
{
	abstract void disp();
	abstract void test();
}
class Sample extends Demo
{
	void disp()
	{
		System.out.println("Hi");
	}
	void test()
	{
		System.out.println("Hello");
	}
}

public class Mainclass {
	public static void main(String[] args) {
		Sample s1=new Sample();
		s1.disp();
		s1.test();
	}

}
