package Second;

public class HierarchialC extends HierarchialA{
	public void drop()
	{
		System.out.println("yes");
	}

	public static void main(String[] args) {
		HierarchialC obj=new HierarchialC();
		obj.drop();
		HierarchialB obj1=new HierarchialB();
		obj1.display();
		obj.show();

	}

}