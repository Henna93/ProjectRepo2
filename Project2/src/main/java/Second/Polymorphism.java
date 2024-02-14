package Second;



public class Polymorphism {
	
		public void show()
		{
			System.out.println("hello");

		}
		public void show(int a,int b)
		{
			int c=a+b;
			System.out.println(c);
		}
		public void show(String s,int id)
		{
			System.out.println("name  :"+s+"  "+"Id No  :"+id);
		}
			public static void main(String[] args) {
				Polymorphism obj=new Polymorphism();
				obj.show();
				obj.show(4,8);  
				obj.show("henna",7);
			}

		}

