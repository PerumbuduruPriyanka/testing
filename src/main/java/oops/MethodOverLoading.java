package oops;

public class MethodOverLoading {
	void Q(int a, String Kan)
	{
		System.out.println("Q");
	}
	void Q(String name, int b)
	{
		System.out.println("One");
	}
	

	public static void main(String[] args) {
	MethodOverLoading Ol=new MethodOverLoading();
	Ol.Q("Venkat",1);
	

	}

}
