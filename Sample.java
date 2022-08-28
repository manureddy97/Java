package constructorchainingtopic;

public class Sample {
	Sample(int a) {
		System.out.println("cool");
	}

	Sample(String s) {
		this(20);
		System.out.println("hoot");
	}

	Sample(String s, int a) {
		this("abc");
		System.out.println("string");
	}

	Sample(int a, String s) {
		this("abc", 20);
		System.out.println("int");
	}

	public static void main(String[] args) {
		new Sample(20, "abc");
	}

}
