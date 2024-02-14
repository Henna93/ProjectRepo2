package Abstract;

public class Abstract2 extends Abstract1{
	public void run()

	{
		System.out.println("yes");
	}
	public static void main(String[] args) {
		Abstract2 obj=new Abstract2();
		obj.run();
		obj.show();		
	}

}
