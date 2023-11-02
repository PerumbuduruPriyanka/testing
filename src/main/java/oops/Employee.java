package oops;

public class Employee {
	int Empid;
	String Ename;
	String EJob;
	int Esal;
	
	
	Employee(String Ename, int Empid, String EJob,int Esal)
	{
		this.Ename=Ename;
		this.Empid=Empid;
		this.EJob=EJob;
		this.Esal=Esal;
		
	}
	
	void Display() {
		System.out.println(Empid);
		System.out.println(Ename);
		System.out.println(EJob);
		System.out.println(Esal);
		
	}
	void show() {
	
		System.out.println("sriram");
	
		
							
		
		
	}
		
	

	public static void main(String[] args) {
		
Employee Em1=new Employee("priyanka", 1, "tester", 90000);
		Em1.Display();



	}

}
