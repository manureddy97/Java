package polymorphismtopic;

class Transport
{
	void via()
	{
		System.out.println("Transport");
	}
}
class Car extends Transport
{
	void via()
	{
		System.out.println("via car");
	}
}
class Bus extends Transport
{
	void via()
	{
		System.out.println("via Bus");
	}
}
class Metro extends Transport
{
	void via()
	{
		System.out.println("via Metro");
	}
}
class Passenger
{
	static void travel(Transport t1)
	{
		t1.via();
	}
}

public class Mainclass {
	public static void main(String[] args) {
		Car c1=new Car();
		Bus b1=new Bus();
		Metro m1=new Metro();
		Passenger.travel(c1);
		Passenger.travel(b1);
		Passenger.travel(m1);
	}
}
