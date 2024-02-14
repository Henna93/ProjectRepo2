package Finalpackage;

public class NewFinal {
	final int a=8;
	public void show()
	{
		a=5;
		System.out.println(a);
	}

	public static void main(String[] args) {
		
NewFinal obj=new NewFinal();
obj .show();
	}

}
