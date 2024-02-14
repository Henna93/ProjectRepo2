package Second;

public class BookAgre1 {
float page;
double index;
BookAgre a;
BookAgre1(float page, double index, BookAgre a)
{
	this.page=page;
	this.index=index;
	this.a=a;
}
public void display()
{
	System.out.println(a.price);
	System.out.println(a.name);
	System.out.println("page is :"+page);
	System.out.println("index is :"+index);
}
	public static void main(String[] args) {
		
BookAgre obj= new BookAgre(300,"kkk");
BookAgre1 obj1=new BookAgre1(200.89f,23444,obj);
obj1.display();
	}

}
